package com.BookApp.BookApplication.Controller;

import com.BookApp.BookApplication.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.BookApp.BookApplication.Entity.Book;
@RestController
@RequestMapping("/book/v1")
public class BookController {

    private final BookService bookService;
    @Autowired
    BookController(BookService bookServ){
        this.bookService = bookServ;
    }
    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book savedBook = bookService.addBook(book);
        return ResponseEntity.ok(savedBook);
    }
    @GetMapping("/getBook/{bookName}")
    public ResponseEntity<Book> getBookById(@PathVariable("bookName") String name){
        Book bookName = bookService.getBookByName(name);
        return ResponseEntity.ok(bookName);
    }
    @PutMapping("/updateBook")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        Book updatedBook = bookService.updateBook(book);
        return ResponseEntity.ok(updatedBook);
    }
    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable int id){
        bookService.deleteBook(id);
        return ResponseEntity.ok().build();
    }
}
