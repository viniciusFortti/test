package testerepos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import testerepos.DTO.UsuarioDTO;
import testerepos.DTO.UsuarioEnderecoDTO;
import testerepos.Entity.Usuario;
import testerepos.Service.EnderecoService;
import testerepos.Service.UsuarioService;

@Controller
@RequestMapping("/Usuario-Endereco")
public class UsuarioEnderecoController {

    @Autowired
    UsuarioService usuarioService;

    EnderecoService enderecoService;

    @PostMapping(value = "/")
    @ResponseBody
    public Usuario salvar(@RequestBody UsuarioEnderecoDTO dto) {
        enderecoService.salvar(dto.getEndereco());
        return usuarioService.salvar(dto.getUsuario());
    }

}
