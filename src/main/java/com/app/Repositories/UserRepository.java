package com.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Models.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
