package br.com.vinicius.Semana1.Animal;

public class Mamifero extends Animal {


    private Boolean fome;


    public void mamar(Mamifero mamifero){
        if(mamifero.getFome() == true && mamifero.getExtinção() == true) {
            System.out.println("animal " + mamifero.getRaça() +" mamando.");
            mamifero.setFome(false);
        }else {
            System.out.println("o bixo ja ta morto");
        }
    }

    public Boolean getFome() {
        return fome;
    }

    public void setFome(Boolean fome) {
        this.fome = fome;
    }
}
