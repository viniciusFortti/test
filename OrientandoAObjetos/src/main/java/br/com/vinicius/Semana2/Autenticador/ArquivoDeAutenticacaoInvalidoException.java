package br.com.vinicius.Semana2.Autenticador;

public class ArquivoDeAutenticacaoInvalidoException extends RuntimeException{


    public ArquivoDeAutenticacaoInvalidoException() {
        super();
    }

    public ArquivoDeAutenticacaoInvalidoException(String s) {
        super(s);
    }

    public ArquivoDeAutenticacaoInvalidoException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ArquivoDeAutenticacaoInvalidoException(Throwable throwable) {
        super(throwable);
    }

    protected ArquivoDeAutenticacaoInvalidoException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}

