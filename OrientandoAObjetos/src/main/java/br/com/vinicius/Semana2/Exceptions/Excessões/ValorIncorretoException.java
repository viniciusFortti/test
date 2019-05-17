package br.com.vinicius.Semana2.Exceptions.Excessões;

public class ValorIncorretoException extends Exception {

    private static final String mensagem = "O VALOR DIGITADO NAO CONFERE.";

    @Override
    public String getMessage(){
        return mensagem;
    }
}
