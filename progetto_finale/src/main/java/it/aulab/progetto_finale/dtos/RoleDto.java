package it.aulab.progetto_finale.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class RoleDto {

    private Long id;

    @NotEmpty(message = "Name should not be empty") 
    private String name;
}
