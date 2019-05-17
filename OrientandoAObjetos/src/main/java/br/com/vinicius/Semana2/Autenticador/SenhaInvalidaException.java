package br.com.vinicius.Semana2.Autenticador;

public class SenhaInvalidaException extends AutenticacaoException {

    private String senha;

    public SenhaInvalidaException(String message, String login, String senha) {
        super(message, login);
        this.senha=senha;
    }

    public String getSenha() {
        return senha;
    }
}
