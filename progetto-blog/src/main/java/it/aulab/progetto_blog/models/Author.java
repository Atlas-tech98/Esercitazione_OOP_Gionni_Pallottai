package it.aulab.progetto_blog.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "authors")
public class Author {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @GeneratedValue(strategy = GenerationType.AUTO) -- lasciamo al framework capire quale strategia usare per generare l'id,
    //                                                      in base al database che stiamo usando
    // @GeneratedValue(strategy = GenerationType.SEQUENCE) -- crea una sequenza di numeri per generare l'id,
    //                                                          utile per database come Oracle
    // @GeneratedValue(strategy = GenerationType.UUID) -- crea un id esadecimale univoco,
    //                                                          utile per database come MongoDB
    private Long id;

    // private String firstname;
    // private String lastname;
    // private String email;

    @Column(name = "firstname", nullable = true) // usare "@Column" se il nome della colonna nel database è diverso dal nome del campo nella classe,
    // inoltre ci permette di specificare se un valore può essere nullo o meno, la lunghezza massima, ecc.
    // @Column(name = "firstname", nullable = true)
    private String name;
    @Column(name = "lastname", nullable = true)
    private String surname;
    @Column(nullable = false, unique = true) // specifica che il campo non può essere nullo e deve essere univoco
    private String email;

    @OneToMany (mappedBy = "author") // specifica che la relazione è bidirezionale e che il campo "author" nella classe "Post"
    //  è il proprietario della relazione
    private List<Post> posts = new ArrayList<Post>();

    public Author() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return name;
    }

    public void setFirstname(String firstname) {
        this.name = firstname;
    }

    public String getLastname() {
        return surname;
    }

    public void setLastname(String lastname) {
        this.surname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
