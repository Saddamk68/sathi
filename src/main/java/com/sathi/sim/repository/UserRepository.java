package com.sathi.sim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathi.sim.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
