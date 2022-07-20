package com.pokepok.rest.enumeration;
import static com.pokepok.rest.constant.Authority.*;

public enum Role {
	ROLE_USER (USER_AUTHORITIES),
	ROLE_HR (HR_AUTHORITIES),
	ROLE_MANAGER(MANAGER_AUTHORITIES),
	ROLE_ADMIN(ADMIN_AUTHORITIES),
	ROLE_SUPER_ADMIN(SUPER_ADMIN_AUTHORITIES);
	
	private String[] authorities;
	
	Role(String...authorities){ //convertie authorities en une liste d'objets autorisé (chaine de caractere)
		this.authorities = authorities;
	}
	public String[] getAuthorities() {
		return authorities;
	}
}
