package it.aulab.progetto_finale.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import it.aulab.progetto_finale.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);

}
