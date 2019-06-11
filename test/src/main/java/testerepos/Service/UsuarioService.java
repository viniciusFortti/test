package testerepos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import testerepos.Entity.Usuario;
import testerepos.Repository.UsuarioRepository;

public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Transactional(rollbackFor = Exception.class)
    public Usuario salvar(Usuario usuario){

        return usuarioRepository.save(usuario);
    }

    @Transactional(rollbackFor = Exception.class)
    public Usuario buscaPorId(int id){
        return usuarioRepository.findById(id).get();
    }

    @Transactional(rollbackFor = Exception.class)
    public Usuario editar(int id, Usuario usuario){
        usuario.setId(id);
        return usuarioRepository.save(usuario);

    }

    @Transactional(rollbackFor =  Exception.class)
    public void remover(Usuario usuario){
        usuarioRepository.delete(usuario);
    }

}
