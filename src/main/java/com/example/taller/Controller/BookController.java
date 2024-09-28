package com.example.taller.Controller;



import com.example.taller.Model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
 class BookController {

    @GetMapping("/{title}/{author}/{year}")

    public String showBook(@PathVariable String title, @PathVariable String author, @PathVariable int year, Model model) {

        Book book = new Book(title, author, year);

        model.addAttribute("book", book);

        return "book";
    }
}
