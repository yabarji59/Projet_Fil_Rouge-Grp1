package com.fr.gestion.service.security.imp;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import com.fr.gestion.service.security.IJwtTokenService;
import com.fr.gestion.web.model.JwtTokens;
import com.fr.gestion.web.model.UtilisateurSecurityDto;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.DefaultClaims;

@Service
public class JwtTokenServiceImpl implements IJwtTokenService {

    private static final String    USER_SECRET = "tokenSecret";

    @Value("${cda.security.token.secret}")
    private String                 secret;

    @Autowired
    private UserDetailsServiceImpl userService;

    @Override
    public JwtTokens createTokens(Authentication authentication) {
        System.err.println("6");
        String token;
        String refreshToken;
        System.err.println("7");
        UtilisateurSecurityDto user = (UtilisateurSecurityDto) authentication.getPrincipal();
        System.err.println("8");
        token = createToken(user);
        System.err.println("9");
        refreshToken = createRefreshToken(user);
        System.err.println("10");
        return new JwtTokens(token, refreshToken);
    }

    @Override
    public String createToken(UtilisateurSecurityDto user) {
        System.err.println("7");
        return Jwts.builder().signWith(SignatureAlgorithm.HS512, secret).setClaims(buildUserClaims(user)).setExpiration(getTokenExpirationDate(false)).setIssuedAt(new Date()).compact();
    }

    @Override
    public String createRefreshToken(UtilisateurSecurityDto user) {
        System.err.println("8");
        return Jwts.builder().signWith(SignatureAlgorithm.HS512, secret).setClaims(buildUserClaims(user)).setExpiration(getTokenExpirationDate(true)).setIssuedAt(new Date()).compact();
    }

    @Override
    public JwtTokens refreshJwtToken(String refreshToken) {
        System.err.println("10");
        Jws<Claims> claims = validateJwtRefreshToken(refreshToken);
        String newToken = createTokenFromClaims(claims);
        return new JwtTokens(newToken, refreshToken);
    }

    @Override
    public Jws<Claims> validateJwtToken(String token) {
        System.err.println("9");
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
    }

    private String createTokenFromClaims(Jws<Claims> jws) {
        System.err.println("11");
        return Jwts.builder().setClaims(jws.getBody()).signWith(SignatureAlgorithm.HS512, secret).setExpiration(getTokenExpirationDate(false)).setIssuedAt(new Date()).compact();
    }

    private Jws<Claims> validateJwtRefreshToken(String token) {
        System.err.println("12");
        JwtParser parser = Jwts.parser().setSigningKey(secret);
        Jws<Claims> claims = parser.parseClaimsJws(token);
        UtilisateurSecurityDto user = (UtilisateurSecurityDto) userService.loadUserByUsername(claims.getBody().getSubject());
        return parser.require(USER_SECRET, user.getTokenSecret()).parseClaimsJws(token);
    }

    private Date getTokenExpirationDate(boolean refreshToken) {
        System.err.println("13");
        Calendar calendar = Calendar.getInstance();
        if (refreshToken) {
            calendar.add(Calendar.MONTH, 1);
        } else {
            calendar.add(Calendar.MINUTE, 30);
        }

        return calendar.getTime();
    }

    private Claims buildUserClaims(UtilisateurSecurityDto user) {
        System.err.println("14");
        Claims claims = new DefaultClaims();
        claims.setSubject(String.valueOf(user.getId()));
        claims.put("username", user.getUsername());
        claims.put("roles", String.join(",", AuthorityUtils.authorityListToSet(user.getAuthorities())));
        claims.put(USER_SECRET, user.getTokenSecret());
        return claims;
    }

}
