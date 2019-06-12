package testerepos.Controller;


import testerepos.DTO.UsuarioDTO;
import testerepos.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import testerepos.Entity.Usuario;


@Controller
@RequestMapping("/api/Usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping(value = "/{id}")
    @ResponseBody
    public Usuario buscarPorId(@PathVariable int id) {
        return usuarioService.buscaPorId(id);
    }

    @PostMapping(value = "/registrar")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Usuario salvar(@RequestBody UsuarioDTO dto) {
            return usuarioService.salvar(dto.transformaParaObjeto());
    }

    @PutMapping(value = "/editar/{id}")
    @ResponseBody
    public Usuario editar(@RequestBody UsuarioDTO dto,@PathVariable int id){
           return usuarioService.editar(id,dto.transformaParaObjeto());
    }

}



