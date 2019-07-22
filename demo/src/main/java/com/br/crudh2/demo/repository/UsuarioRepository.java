package com.br.crudh2.demo.repository;

import com.br.crudh2.demo.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
