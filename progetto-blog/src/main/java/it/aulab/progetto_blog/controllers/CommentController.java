package it.aulab.progetto_blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import it.aulab.progetto_blog.models.Comment;
import it.aulab.progetto_blog.repositories.CommentRepository;


@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    CommentRepository commentRepository;


    // READ ALL
    @GetMapping
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }


    // READ ONE
    @GetMapping("{id}")
    public Comment getComment(@PathVariable("id") Long id) {

        if (commentRepository.existsById(id)) {

            return commentRepository.findById(id).get();

        } else {

            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Comment not found"
            );
        }
    }


    // CREATE
    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {

        return commentRepository.save(comment);
    }


    // UPDATE
    @PutMapping("{id}")
    public Comment updateComment(
        @PathVariable("id") Long id,
        @RequestBody Comment comment
    ) {

        if (commentRepository.existsById(id)) {

            comment.setId(id);

            return commentRepository.save(comment);

        } else {

            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Comment not found"
            );
        }
    }


    // DELETE
    @DeleteMapping("{id}")
    public void deleteComment(@PathVariable("id") Long id) {

        if (commentRepository.existsById(id)) {

            commentRepository.deleteById(id);

        } else {

            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Comment not found"
            );
        }
    }
}
