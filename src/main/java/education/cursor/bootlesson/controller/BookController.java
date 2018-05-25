package education.cursor.bootlesson.controller;


import education.cursor.bootlesson.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/")
    public List<Book> getBooks(){
        return Arrays.asList(new Book(1, "War and Peace", "Huge book"));
    }
}
