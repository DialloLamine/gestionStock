package com.onediallo.gestion.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onediallo.gestion.model.User;

import java.util.List;

@Repository
public interface IUsersJpaDao extends JpaRepository<User, String>{
	
	@Query("select u.username from TUSER u where u.role=1")
	List<String> getUsername();

}
