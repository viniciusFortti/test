package br.com.vinicius.Semana2.Autenticador;

public class PerfilDeUsuarioInvalidoException extends AutenticacaoException{

    private Usuario user;

    public PerfilDeUsuarioInvalidoException(String message, String login,Usuario usuario) {
        super(message, usuario.getLogin());
        this.user = usuario;
    }

    public Usuario getUser() {
        return user;
    }
}
