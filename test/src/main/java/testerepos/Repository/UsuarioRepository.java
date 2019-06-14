package testerepos.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import testerepos.Entity.Usuario;

import java.util.List;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    Usuario findByNome(String nome);

}
