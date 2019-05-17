package br.com.vinicius.Semana2.Autenticador;

import java.security.spec.ECFieldF2m;

public class UsuarioInvalidoException extends AutenticacaoException {


    public UsuarioInvalidoException(String message, String login) {
        super(message, login);
    }
}
