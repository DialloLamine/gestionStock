/**
 * 
 */
package com.onediallo.gestion.model;

//import javax.persistence.*; think about it after ...............

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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Diallo
 *
 */

//@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TDRIVER")
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "nom", "prenom" }))
@Data
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Getter
	@OneToOne(optional = false, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "FKUSER", unique = true, nullable = false, updatable = false)
	private User user;

	@Nonnull
	//@Size(min = 1, max = 40, message = "{etudiant.nom}")
	@Column(length = 40, nullable = false)
	private String nom;

	@Nonnull
	//@Size(min = 1, max = 30, message = "{etudiant.prenom}")
	@Column(length = 30, nullable = false)
	private String prenom;

	//@Email(message = "{email.nonValide}")
	@Nonnull
	//@Size(min = 4, max = 50, message = "{etudiant.email}")
	@Column(length = 50, nullable = false)
	private String email;

	//@Size(min = 4, max = 30, message = "{etudiant.tel}")
	@Column(length = 50)
	private String tel;


	
	/**
	 * @param user
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param tel
	 */
	public Driver(User user, String nom, String prenom, String email, String tel) {
		assert (user.getRole() == Roles.DRIVER);
		this.user = user;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
	}

	
	
}
