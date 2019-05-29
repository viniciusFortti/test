package br.com.vinicius.Semana3.Decorator;


public class Main {

    public static void main(String[] args) {

        Carro carroTest = new CarroDesgovernadoDecorator(
                new CarroCurvaDecorator(new CarroSimples()));

        carroTest.andar();
    }
}


