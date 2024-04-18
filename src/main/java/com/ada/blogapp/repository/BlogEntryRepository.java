package com.ada.blogapp.repository;

import com.ada.blogapp.repository.entity.postgre.BlogEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogEntryRepository extends JpaRepository<BlogEntry, Long> {

}