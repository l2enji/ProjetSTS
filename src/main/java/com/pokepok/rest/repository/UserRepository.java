package com.pokepok.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokepok.rest.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findUserByUsername(String username);
	User findUserByEmail(String email);

}
