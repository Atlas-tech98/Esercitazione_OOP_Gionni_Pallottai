package it.aulab.progetto_finale.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class UserDto {

    private Long id;
    @NotEmpty(message = "Userame should not be empty")
    private String username;
    @NotEmpty(message = "Email should not be empty")
    @Email 
    private String email;
    @NotEmpty 
    private String password;
}
