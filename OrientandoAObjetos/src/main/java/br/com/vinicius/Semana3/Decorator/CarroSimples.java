package br.com.vinicius.Semana3.Decorator;

public class CarroSimples extends Carro {


    private final String cor;
    private final String modelo;

    public CarroSimples(String cor, String modelo) {

        this.cor=cor;
        this.modelo=modelo;
    }

    public void andar(){
        System.out.println( "andando a mais de 130km/h");
    }



    @Override
    public String toString() {
        return "CarroSimples{" +
                "cor='" + this.getCor() + '\'' +
                ", modelo='" + this.getModelo() + '\'' +
                '}';
    }
}
