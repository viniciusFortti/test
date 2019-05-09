package Animais;

public class Mamiferos  {


    public String raça;
    private Double peso;
    protected String som;

    private void fazerSom() {
        System.out.println(som);
    }

    public void dadosAnimais() {
        System.out.println("----------");
        System.out.println(raça);
        System.out.println(peso);
        System.out.println(som);
    }

    protected void pesoAnimais() {
        System.out.println(peso);
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }
}


