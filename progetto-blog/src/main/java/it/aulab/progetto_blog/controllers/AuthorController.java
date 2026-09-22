package it.aulab.progetto_blog.controllers;

import it.aulab.progetto_blog.models.Author;
import it.aulab.progetto_blog.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller 
@RequestMapping("/authors")
public class AuthorController {

    @Autowired 
    AuthorService authorService;

    @GetMapping
    public String authorsView(Model viewModel) {
        viewModel.addAttribute("title", "Authors");
        viewModel.addAttribute("authors", authorService.readAll());
        return "authors";
    }

    @GetMapping("create")
    public String createAuthorView(Model viewModel){
        viewModel.addAttribute("title", "Create Author");
        viewModel.addAttribute("author", new Author());
        return "createAuthor";
    }

    @PostMapping
    public String createAuthor(@ModelAttribute("author") Author author){
        authorService.create(author);
        return "redirect:/authors";
    }
      
}
