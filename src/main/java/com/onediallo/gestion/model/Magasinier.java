/**
 * 
 */
package com.onediallo.gestion.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author DIALLO
 *
 */
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "TMAGASINIER")
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "nom", "prenom" }))
public class Magasinier {

	
	@Id // 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter //pas de setter
	private Integer id;

	@Getter
	@OneToOne(optional = false, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "FKUSER", unique = true, nullable = false, updatable = false)
	private User user;

	@Nonnull // To check after Javax Librairy................
	//@Size(min = 1, max = 40, message = "{elem.nom}")
	@Column(length = 40, nullable = false)
	private String nom;
	
	@Nonnull
	//@Size(min = 1, max = 40, message = "{elem.prenom}")
	@Column(length = 40, nullable = false)
	private String prenom;

	//@Email(message = "{email.nonValide}")
	@Nonnull
	@Column(length = 50, nullable = false)
	private String email;

	/**
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param user
	 */
	public Magasinier(String nom, String prenom, String email, User user) {
		this(null, nom, prenom, email, user);
	}

	/**
	 * @param id
	 * @param user
	 * @param nom
	 * @param prenom
	 * @param email
	 */
	public Magasinier(Integer id, String nom, String prenom, String email, User user) {
		assert (user.getRole() == Roles.MAGASINIER);
		this.id = id;
		this.user = user;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		//this.user.setRole(Roles.ROLE_PROF);
	}

	

}

