package it.aulab.progetto_blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 
@RequestMapping("/authors")
public class AuthorController {

    @GetMapping
    public String authorsView(Model viewModel) {
        viewModel.addAttribute("title", "Authors");
        return "authors";
    }
    
}
