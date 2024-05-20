package com.praveen.api.API.repository;

import com.praveen.api.API.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
