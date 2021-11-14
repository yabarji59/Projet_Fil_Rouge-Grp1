package com.fr.gestion.service.security.imp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fr.gestion.persistence.entities.UtilisateurDo;
import com.fr.gestion.persistence.repository.IUtilisateurDao;
import com.fr.gestion.web.model.UtilisateurSecurityDto;



@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private IUtilisateurDao utilisateurDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.err.println("15");
		Objects.requireNonNull(username);
		UtilisateurDo userE = utilisateurDao.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ADMIN"));
		return new UtilisateurSecurityDto(userE.getIdUtilisateur(), userE.getEmailUtilisateur(), userE.getPasswordUtilisateur(), authorities, true, LocalDate.now(), userE.getTokenSecret());
	}

}
