package com.backendMarchPro.LibrariManagmentSystem.Service;

import com.backendMarchPro.LibrariManagmentSystem.Dto.BookRequestDto;
import com.backendMarchPro.LibrariManagmentSystem.Dto.BookResponseDto;
import com.backendMarchPro.LibrariManagmentSystem.Entity.Author;
import com.backendMarchPro.LibrariManagmentSystem.Entity.Book;
import com.backendMarchPro.LibrariManagmentSystem.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {
    @Autowired
    AuthorRepository authorRepository;

    public BookResponseDto addBook(BookRequestDto bookRequestDto) throws Exception {

        // get the author object
        Author author = authorRepository.findById(bookRequestDto.getAuthorId()).get();

        Book book = new Book();
        book.setTitle(bookRequestDto.getTitle());
        book.setGenre(bookRequestDto.getGenre());
        book.setPrice(bookRequestDto.getPrice());
        book.setIssued(false);
        book.setAuthor(author);

        author.getBooks().add(book);
        authorRepository.save(author);  // will save both book and author

        // create a response also
        BookResponseDto bookResponseDto = new BookResponseDto();
        bookResponseDto.setTitle(book.getTitle());
        bookResponseDto.setPrice(book.getPrice());

        return bookResponseDto;
    }
}
