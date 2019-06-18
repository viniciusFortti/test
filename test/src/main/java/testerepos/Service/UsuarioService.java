package testerepos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import testerepos.Entity.Usuario;
import testerepos.Repository.UsuarioRepository;

import java.util.List;

import static testerepos.Service.UtilService.validarUsuario;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Transactional(rollbackFor = Exception.class)
    public Usuario salvar(Usuario usuario){
        if(validarUsuario(usuario)) {
            usuario.setSenha(new BCryptPasswordEncoder().encode(usuario.getSenha()));
            return usuarioRepository.save(usuario);
        }
        else{return null;}
    }

    @Transactional(rollbackFor = Exception.class)
    public Usuario editar(int id, Usuario usuario) {
        if (validarUsuario(usuario)) {
            usuario.setId(id);
            return usuarioRepository.save(usuario);
        }
        else{return null;}
    }
    @Transactional(rollbackFor = Exception.class)
    public Usuario buscaPorId(int id){
        return usuarioRepository.findById(id).get();
    }

    @Transactional(rollbackFor =  Exception.class)
    public void remover(Usuario usuario){
        usuarioRepository.delete(usuario);
    }

    @Transactional(rollbackFor = Exception.class)
    public Usuario buscaPorNome(String nome){
        return usuarioRepository.findByNome(nome);
    }

    @Transactional(rollbackFor = Exception.class)
    public List<Usuario> buscarTodos(){
        List<Usuario> todosUsuarios = (List<Usuario>) usuarioRepository.findAll();
        return todosUsuarios;
    }

}
