package com.ada.blogapp.repository;

import com.ada.blogapp.repository.entity.postgre.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}