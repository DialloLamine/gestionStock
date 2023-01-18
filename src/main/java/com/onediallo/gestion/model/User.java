package com.onediallo.gestion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "TUSER")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Data
public final class User {

	@Id
	@Column(length = 50, nullable = false)
	private final String username; // identifiant

	@Column(length = 100, nullable = false)
	@ToString.Exclude
	private final String password;
	


	@Column(nullable = true)
	private final Roles role;
	
}
