package br.com.vinicius.Semana3;

import br.com.vinicius.Semana3.Java8.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.awt.Button;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Usuario user1=new Usuario("vinicius", 8);
        Usuario user2=new Usuario("adamastor", 28);
        Usuario user3=new Usuario("jean Cloude", 15);

        ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        usuarios.forEach(u -> u.turnModerador());

        usuarios.forEach(u -> System.out.println(u.toString()));

        new Thread(() -> {
            for (int i=0; i <= 5; i++) {
                System.out.println(i);
            }
        }).start();

        Button button=new Button();

        button.addActionListener(
                event -> System.out.println("evento do click acionado"));


        usuarios.forEach(u -> System.out.println(u.getNome().contains("a")));

        //FAZENDO UM REMOVEIF COM CLASSE ANONIMA
        //Predicate<Usuario> predicado=new Predicate<Usuario>() {

          //  public boolean test(Usuario usuario) {

            //    return (usuario.getPontos() > 10);
            //}
        //};

        //usuarios.removeIf(predicado);

        //comparando com lambda
        usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));

        usuarios.forEach(u -> System.out.println(u.toString()));

        //REMOVEIF COM LAMBDA
        usuarios.removeIf(u -> u.getPontos() > 10);

        usuarios.forEach(u -> System.out.println(u.toString()));




    }
}


