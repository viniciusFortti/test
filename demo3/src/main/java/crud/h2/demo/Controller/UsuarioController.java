package crud.h2.demo.Controller;

import java.util.List;

import crud.h2.demo.Service.UsuarioService;
import crud.h2.demo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping(value = "/{id}")
    public Usuario find(@PathVariable Long id){
        return usuarioService.find(id);
    }

    @PostMapping
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @PutMapping(value="/{id}")
    public Usuario edit(@PathVariable Long id, @RequestBody Usuario Usuario) {
        return usuarioService.edit(id, Usuario);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        usuarioService.delete(id);
        return new ResponseEntity<>(null, HttpStatus.OK);    }
}

