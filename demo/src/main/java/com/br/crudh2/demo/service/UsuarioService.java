package com.br.crudh2.demo.service;

import com.br.crudh2.demo.model.Usuario;
import com.br.crudh2.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> visualizar(Long id) {
        return usuarioRepository.findById(id);
    }

    //public Usuario editar(Long id, Usuario usuario) {
    //    usuario.setId(id);
    //    return usuarioRepository.save(usuario);
    //}

    public void excluir(Long id) {
        usuarioRepository.deleteById(id);
    }
}
