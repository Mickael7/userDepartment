package com.AulaSpring.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AulaSpring.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
