package testerepos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import testerepos.Entity.Endereco;
import testerepos.Entity.Usuario;
import testerepos.Repository.EnderecoRepository;

import static testerepos.Service.UtilService.validarUsuario;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    @Transactional(rollbackFor = Exception.class)
        public Endereco salvar(Endereco endereco){

            return enderecoRepository.save(endereco);
    }

    @Transactional(rollbackFor = Exception.class)
    public Endereco editar(int id, Endereco endereco) {
            endereco.setId(id);
            return enderecoRepository.save(endereco);
    }

    @Transactional(rollbackFor = Exception.class)
    public Endereco buscaPorId(int id){
        return enderecoRepository.findById(id).get();
    }

    @Transactional(rollbackFor =  Exception.class)
    public void remover(Endereco endereco){
        enderecoRepository.delete(endereco);
    }
}
