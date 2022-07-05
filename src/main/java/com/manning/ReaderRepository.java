package com.manning;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;



public interface ReaderRepository extends JpaRepository<Reader, String> {
	@Query("SELECT r FROM Reader r WHERE r.username = :username ")
	public UserDetails findOne(@Param("username") String username);
	
}
