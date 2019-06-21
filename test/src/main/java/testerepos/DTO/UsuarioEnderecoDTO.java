package testerepos.DTO;

import testerepos.Entity.Endereco;
import testerepos.Entity.Usuario;

public class UsuarioEnderecoDTO {

    private Endereco endereco;
    private Usuario usuario;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
