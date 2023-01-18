package com.onediallo.gestion.service;

import java.util.List;

import java.util.Optional;

import javax.security.auth.login.CredentialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onediallo.gestion.dao.IUsersJpaDao;
import com.onediallo.gestion.model.User;


@Transactional
@Service
public class UserServices {
	
//	@Autowired
//	PasswordEncoder encodeur;
	
	@Autowired
	private IUsersJpaDao userDao;

	
	public Optional<User> findById(String username) throws Exception {
		return userDao.findById(username);
	}

	/**
	 * Un utilisateur est g�n�ralement li� � une personne
	 * sauf dans des cas particuliers comme pour l'administrateur
	 * 
	 * @param user
	 * @return le user sauv� qui peut avoir �t� modifi� suite � la persistance
	 */
	public User createUser(User user) {
		return userDao.save(user);
	}

	/**
	 * Supprime l'utilisateur 
	 * cependant il ne devra plus �tre li� � une personne (etudiant,...)
	 * 
	 * @param username
	 */
	public void deleteUser(String username) {
		userDao.deleteById(username);
	}

	/**
	 * 
	 * @param user 
	 * @param oldPassword non crypt�
	 * @param newPassword non crypt� et suppos� valid�
	 * @throws CredentialException 
	 */
//	@PreAuthorize("hasRole('ADMIN') or  #user.username eq authentication.name")
//	public void changePassword(User user, String oldPassword, String newPassword) throws CredentialException {
//		//v�rifie l'existance du user
//		//r�cup�re le user dans la BD pour voir s'il existe bien 
//		User userDb=userDao.findById(user.getUsername()).orElseThrow(
//				()->new Exception("{user.inexistant}"));
//		//V�rifie qu'il correspond avec celui � modifier
//		if(! user.equals(userDb))
//			throw  new CredentialException("{user.different}");
//		
//		//v�rification du pw
//		if(!encodeur.matches(oldPassword, userDb.getPassword()))
//			throw new CredentialException("{user.badPassword}");	
//		userDao.save(new User(user.getUsername(),encodeur.encode(newPassword),user.getRole()));
//	}

	public boolean userExists(String username) {
		return userDao.existsById(username);	
	}

	public boolean existsById(String username) {
		return userDao.existsById(username);
	}
	
	public List<String> getUsername(){
		return userDao.getUsername();
	}

}
