package br.com.vinicius.Semana3.Decorator;


public class Main {

    public static void main(String[] args) {
        CarroSimples carro = new CarroSimples("amarelo","camaro SS ");
        Carro carroTest = new CarroDesgovernadoDecorator(new CarroCurvaDecorator(carro));
        carroTest.andar();
        System.out.println(carro.toString());


    }
}


