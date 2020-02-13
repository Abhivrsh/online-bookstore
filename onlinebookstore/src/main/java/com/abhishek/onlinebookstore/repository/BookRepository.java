package com.abhishek.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book , Long> {

	
}
