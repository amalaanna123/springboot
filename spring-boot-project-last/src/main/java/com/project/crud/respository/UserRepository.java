package com.project.crud.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.crud.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}