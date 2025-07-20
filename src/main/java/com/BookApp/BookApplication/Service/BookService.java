package com.BookApp.BookApplication.Service;

import com.BookApp.BookApplication.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.BookApp.BookApplication.Entity.Book;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public Book addBook(Book book){
        return bookRepository.save(book);
    }
    public Book getBookByName(String name){
        return bookRepository.findBookByTitle(name);
    }
    public Book updateBook(Book book){
        Book existingBook = bookRepository.findById(book.getId())
                .orElseThrow(() -> new RuntimeException("Book not found with ID: " + book.getId()));
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setGenre(book.getGenre());

        return bookRepository.save(existingBook);
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}
