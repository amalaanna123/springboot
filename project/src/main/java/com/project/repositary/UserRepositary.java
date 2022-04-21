package com.project.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.User;

public interface UserRepositary extends JpaRepository<User, Integer> {

}
