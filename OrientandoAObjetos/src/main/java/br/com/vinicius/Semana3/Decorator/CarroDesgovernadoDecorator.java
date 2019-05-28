package br.com.vinicius.Semana3.Decorator;

public class CarroDesgovernadoDecorator extends CarroDecorator{


    public CarroDesgovernadoDecorator(Carro carroDecorado){
        super(carroDecorado);
    }

    @Override
    public void andar() {
        carroDecorado.andar();
        carroDesgovernado();
    }

    public void carroDesgovernado() {
        System.out.println( "perdeu o controle do carro");
    }

}
