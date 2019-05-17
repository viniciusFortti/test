package br.com.vinicius.Semana2.Autenticador;

public abstract class AutenticacaoException extends Exception {

    protected String login;

    public AutenticacaoException (String message, String login) {
        super(message);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
