package com.backendMarchPro.LibrariManagmentSystem.Repository;

import com.backendMarchPro.LibrariManagmentSystem.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
