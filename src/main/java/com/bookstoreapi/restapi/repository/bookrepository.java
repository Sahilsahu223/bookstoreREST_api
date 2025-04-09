package com.bookstoreapi.restapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bookstoreapi.restapi.entity.book;
public interface bookrepository extends JpaRepository<book, Integer> {
   
}
