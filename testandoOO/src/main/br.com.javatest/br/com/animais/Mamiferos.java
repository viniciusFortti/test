package br.com.animais;

public class Mamiferos {

    public String raça;
    private Double peso;
    protected String som;

    private void fazerSom() {
        System.out.println(som);
    }

    public void dadosAnimais() {
        System.out.println(raça);
        System.out.println(peso);
        System.out.println(som);
    }

    protected  void pesoAnimais() {
        System.out.println(peso);
    }

    public class main {

        Mamiferos m = new Mamiferos();

    }

}