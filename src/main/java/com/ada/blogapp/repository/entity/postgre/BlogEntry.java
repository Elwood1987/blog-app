package com.ada.blogapp.repository.entity.postgre;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class BlogEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private Date publishDate;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

}
