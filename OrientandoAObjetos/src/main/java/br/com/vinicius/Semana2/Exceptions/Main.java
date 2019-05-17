package br.com.vinicius.Semana2.Exceptions;


import br.com.vinicius.Semana2.Exceptions.Excessões.ValorIncorretoException;


public class Main {

    private static void aumentarLetras() throws ValorIncorretoException //lançando excessão
    {
        String frase = null;
        String novaFrase = null;
        novaFrase = frase.toUpperCase();
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);

    }

    public static void main(String args[]) {
        try {
            aumentarLetras();
        } catch (ValorIncorretoException e) {
            System.out.println(e.getMessage());

        }
    }
}
