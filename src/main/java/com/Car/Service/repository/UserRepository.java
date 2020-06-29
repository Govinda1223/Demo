package com.Car.Service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Car.Service.model.User;


public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);

}
