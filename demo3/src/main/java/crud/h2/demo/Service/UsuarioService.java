package crud.h2.demo.Service;



import crud.h2.demo.Repository.UsuarioRepository;
import crud.h2.demo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    public UsuarioRepository usuarioRepository;

    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public Usuario find(Long id) {
        return usuarioRepository.findById(id).get();
    }

    public Usuario edit(Long id, Usuario usuario) {
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    public void delete(Long id) { usuarioRepository.deleteById(id); }
}
