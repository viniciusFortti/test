package com.br.crudh2.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Usuario {

    @Id
    private Long id;
    private String nome;
    private Long cpf;
}
