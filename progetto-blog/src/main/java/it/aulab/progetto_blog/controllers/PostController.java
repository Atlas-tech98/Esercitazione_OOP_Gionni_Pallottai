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
import it.aulab.progetto_blog.models.Post;
import it.aulab.progetto_blog.repositories.PostRepository;


@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostRepository postRepository;


    // READ ALL
    @GetMapping
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }


    // READ ONE
    @GetMapping("{id}")
    public Post getPost(@PathVariable("id") Long id) {

        if (postRepository.existsById(id)) {
            return postRepository.findById(id).get();
        } else {
            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Post not found"
            );
        }
    }


    // CREATE
    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postRepository.save(post);
    }


    // UPDATE
    @PutMapping("{id}")
    public Post updatePost(
        @PathVariable("id") Long id,
        @RequestBody Post post
    ) {

        if (postRepository.existsById(id)) {

            post.setId(id);

            return postRepository.save(post);

        } else {

            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Post not found"
            );
        }
    }


    // DELETE
    @DeleteMapping("{id}")
    public void deletePost(@PathVariable("id") Long id) {

        if (postRepository.existsById(id)) {

            Post post = postRepository.findById(id).get();

            // Recupero tutti i commenti associati al post
            List<Comment> postComments = post.getComments();

            // Tolgo l'associazione tra commenti e post
            // I commenti NON vengono cancellati
            for (Comment comment : postComments) {
                comment.setPost(null);
            }

            // Cancello solamente il post
            postRepository.deleteById(id);

        } else {

            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Post not found"
            );
        }
    }
}