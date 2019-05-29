package br.com.vinicius.Semana3.Observable;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Loja loja = new Loja();

        Cliente cliente1 = new Cliente(loja,"vinicius@gmail.com");
        Cliente cliente2 =  new Cliente(loja,"pulgatti@gmail.com");

        loja.lancaItem("Iphone XI");
        loja.lancaItem("mouse gamer");

        Funcionarios func1 = new Funcionarios(
                 loja, "Andre","vendas");
        Funcionarios func2 = new Funcionarios(
                loja, "Joana","SAC");

        loja.deleteObserver(cliente1);
        loja.lancaItem("Samsung 8");
    }
}


