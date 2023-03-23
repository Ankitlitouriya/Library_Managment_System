package com.backendMarchPro.LibrariManagmentSystem.Controller;

import com.backendMarchPro.LibrariManagmentSystem.Entity.Author;
import com.backendMarchPro.LibrariManagmentSystem.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class Authorcontroller {

    @Autowired
    AuthorService authorService;

    // chnage to DTO
    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){

        authorService.addAuthor(author);
        return "Author added successfully";
    }

    @GetMapping("/get_authors")
    public List<Author> getAuthors(){
        return authorService.getAuthors();
    }
}
