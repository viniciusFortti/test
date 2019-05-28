package br.com.vinicius.Semana3.Decorator;

abstract class CarroDecorator extends Carro {

    protected Carro carroDecorado;

    public CarroDecorator(Carro carroDecorado) {
        this.carroDecorado=carroDecorado;
    }
}
