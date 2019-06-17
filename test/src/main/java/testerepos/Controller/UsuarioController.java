package testerepos.Controller;


import org.springframework.boot.ApplicationArguments;
import org.springframework.http.MediaType;
import testerepos.DTO.UsuarioDTO;
import testerepos.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import testerepos.Entity.Usuario;

import java.util.List;


@Controller
@RequestMapping("/Usuarios")
public class UsuarioController{

    @Autowired
    UsuarioService usuarioService;

    @PostMapping(value = "/")
    @ResponseBody
    public Usuario salvar(@RequestBody UsuarioDTO dto) {
        return usuarioService.salvar(dto.transformaParaObjeto());
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public Usuario buscarPorId(@PathVariable int id) {
        return usuarioService.buscaPorId(id);
    }

    @GetMapping(value = "/param")
    @ResponseBody
    public Usuario buscarParametro(@RequestParam String nome){
        return usuarioService.buscaPorNome(nome);
    }

    @PutMapping(value = "/{id}")
    @ResponseBody
    public Usuario editar(@RequestBody UsuarioDTO dto,@PathVariable int id){
           return usuarioService.editar(id,dto.transformaParaObjeto());
    }

    @PatchMapping(value = "/{id}")
    @ResponseBody
    public Usuario editarCampo(@RequestBody Usuario usuario,@PathVariable int id){
        return usuarioService.editar(id,usuario);
    }


    @GetMapping(value = "/")
    @ResponseBody
    public List<Usuario> buscarAll() {
        return usuarioService.buscarTodos();
    }


}



