package testerepos.Repository;

import org.springframework.data.repository.CrudRepository;
import testerepos.Entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    Usuario findByName(String nome);
}
