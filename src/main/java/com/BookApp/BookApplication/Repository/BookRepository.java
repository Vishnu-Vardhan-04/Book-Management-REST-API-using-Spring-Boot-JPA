package com.BookApp.BookApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.BookApp.BookApplication.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
    public Book findBookByTitle(String name);
}
