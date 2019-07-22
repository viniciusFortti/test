package com.br.crudh2.demo.controller;

import com.br.crudh2.demo.model.Usuario;
import com.br.crudh2.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping(value = "/")
    public Usuario salvar(@RequestParam Usuario usuario){
        return usuarioService.salvar(usuario);
    }

    @GetMapping(value = "/{id}")
    public Optional<Usuario> visualizar(@PathVariable Long id){
        return usuarioService.visualizar(id);
    }

    //@PatchMapping(value = "/{id}")
    //public Usuario editar(@PathVariable Long id, @RequestBody Usuario usuario) {
    //    return usuarioService.editar(id, usuario);

    //}

    @DeleteMapping(value = "/{id}")
    public void excluir(@PathVariable Long id){
        usuarioService.excluir(id);
    }

}
