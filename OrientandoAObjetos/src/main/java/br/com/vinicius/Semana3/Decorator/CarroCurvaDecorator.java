package br.com.vinicius.Semana3.Decorator;

public class CarroCurvaDecorator extends CarroDecorator{

    public CarroCurvaDecorator(Carro carroDecorado){
        super(carroDecorado);
    }

    @Override
    public void andar() {
        carroDecorado.andar();
        curvaParaDireita();
        curvaParaEsquerda();
    }

    public void curvaParaDireita(){
        System.out.println( "fazendo curva para a Direita");
    }

    public void curvaParaEsquerda(){
        System.out.println( "fazendo curva para a Esquerda");
    }

   // public void pintarCarro(){
      //  carroDecorado.
    //}
}
