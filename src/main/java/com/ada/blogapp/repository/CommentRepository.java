package com.ada.blogapp.repository;

import com.ada.blogapp.repository.entity.postgre.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    // Otros métodos personalizados si es necesario
}
