package br.com.vinicius.Animal;

public class Cao extends Mamifero {

    @Override
    public void fazerBarulho(){
        System.out.println("O " + this.getRaça() + "faz AU AU AU AU");

    }
}
