package br.com.vinicius.Interface;

public class Mazda extends Carros implements Carro {

    public void girarRodas() {
        System.out.println("fazendo Curvas");

    }

    public void desligarCarro() {
        System.out.println("carro desligado");;
    }


    @Override
    public String toString() {
        return "Mazda{" +
                "nome='" + this.getNome() + '\'' +
                ", marca='" + this.getMarca() + '\'' +
                ", ano=" + this.getAno() + '}';
    }
}
