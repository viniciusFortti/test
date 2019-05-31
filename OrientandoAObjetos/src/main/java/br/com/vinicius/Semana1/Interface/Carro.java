package br.com.vinicius.Semana1.Interface;

public interface Carro {

    default void girarRodas(String string) {
          System.out.println(string);
     }

}
