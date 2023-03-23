package com.backendMarchPro.LibrariManagmentSystem.Repository;

import com.backendMarchPro.LibrariManagmentSystem.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
