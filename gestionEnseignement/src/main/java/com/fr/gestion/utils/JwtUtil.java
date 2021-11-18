package com.fr.gestion.utils;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.fr.gestion.web.model.UserRole;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {
	private String SECRET_KEY = "secret";

	/**
	 * Permet d'extraire le userName pour construire le claim
	 * 
	 * @param token
	 * @return
	 */
	public String extractUsername(final String token) {
		return extractClaim(token, Claims::getSubject);
	}

	/**
	 * Permet d'extraire la date d'expiration du token
	 * 
	 * @param token
	 * @return
	 */
	public Date extractExpiration(final String token) {
		return extractClaim(token, Claims::getExpiration);
	}

	/**
	 * Permet d'extraire un claim
	 * 
	 * @param <T>
	 * @param token
	 * @param claimsResolver
	 * @return
	 */
	public <T> T extractClaim(final String token, Function<Claims, T> claimsResolver) {
		final Claims claims = extractAllClaims(token);
		return claimsResolver.apply(claims);
	}

	/**
	 * Permet d'extraire tous les claims(plaload)
	 * 
	 * @param token
	 * @return
	 */
	private Claims extractAllClaims(final String token) {
		return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
	}

	/**
	 * Permet de verifier si le token en cours n'est pas expiré
	 * 
	 * @param token
	 * @return
	 */
	private Boolean isTokenExpired(final String token) {
		return extractExpiration(token).before(new Date());
	}

	/**
	 * Permet de generer un token
	 * 
	 * @param userDetails
	 * @return
	 */
	public String generateToken(final String userDetails) {
		Map<String, Object> claims = new HashMap<>();
		return createToken(claims, userDetails);
	}

	/**
	 * Permet de créer le token
	 * 
	 * @param claims
	 * @param subject
	 * @return
	 */
	private String createToken(final Map<String, Object> claims, final String subject) {

		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
				.signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
	}

	/**
	 * Permet de valider le token de securité
	 * 
	 * @param token
	 * @param userDetails
	 * @return
	 */
	public Boolean validateToken(final String token, final UserDetails userDetails) {
		final String username = extractUsername(token);
		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}

	/**
	 * Permet de chercher le role de l'utilisateur
	 * 
	 * @param authorities
	 * @param userRole
	 * @return
	 */
	public static boolean checkRole(final Collection<? extends GrantedAuthority> authorities, final UserRole userRole) {

		for (GrantedAuthority authority : authorities) {
			if (authority.getAuthority().contains(UserRole.ROLE_ADMIN.toString()))
				return true;
		}

		return false;
	}

}
