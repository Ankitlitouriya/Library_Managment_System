package com.backendMarchPro.LibrariManagmentSystem.Service;

import com.backendMarchPro.LibrariManagmentSystem.Entity.Author;
import com.backendMarchPro.LibrariManagmentSystem.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public void addAuthor(Author author){

        authorRepository.save(author);
    }

    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }
}