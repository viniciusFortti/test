package testerepos.Repository;

import org.springframework.data.repository.CrudRepository;
import testerepos.Entity.Endereco;

public interface EnderecoRepository extends CrudRepository <Endereco , Integer> {
}
