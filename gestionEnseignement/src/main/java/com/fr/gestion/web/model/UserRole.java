package com.fr.gestion.web.model;

public enum UserRole {

	ROLE_CLIENT("ROLE_CLIENT"), ROLE_ADMIN("ROLE_ADMIN"), ROLE_PRESTATAIRE("ROLE_PRESTATAIRE");

	private String roleAssigned;

	private UserRole(String roleAssigned) {
		this.roleAssigned = roleAssigned;
	}

	@Override
	public String toString() {
		return roleAssigned;
	}

}
