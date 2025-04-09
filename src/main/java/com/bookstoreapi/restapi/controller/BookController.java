package com.bookstoreapi.restapi.controller;

import java.util.List;
import com.bookstoreapi.restapi.entity.book;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import com.bookstoreapi.restapi.repository.bookrepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@RestController
public class BookController {
	@Autowired
	bookrepository repo;
   @GetMapping("/books")
   public List<book> getAllBooks(){
	   List<book> books = repo.findAll();
	   return books;
   }
   @GetMapping("/books/{id}")
   public book getbook(@PathVariable int id) {
	   book b = repo.findById(id).get();
	   return b;
   }
   
   @PostMapping("/books/add")
	public ResponseEntity<book> createStudent(@RequestBody book b) {
		book newbook = repo.save(b);
		return ResponseEntity.status(HttpStatus.CREATED).body(newbook);
	}
	
	@PutMapping("/books/update/{id}")
	public book updateStudents(@PathVariable int id) {
	   book b = repo.findById(id).get();
	   b.setName("Deep Work");
	   b.setPrice(92);
	   repo.save(b);
	   return b;
	}
	@DeleteMapping("/books/delete/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void removeStudent(@PathVariable int id) {
		book b = repo.findById(id).get();
		repo.delete(b);
	}
	
}
