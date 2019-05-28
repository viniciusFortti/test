package br.com.vinicius.Semana3.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        Usuario user1=new Usuario("vinicius", 50000);
        Usuario user2=new Usuario("kleber", 2000);
        Usuario user3=new Usuario("ana", 18000);
        Usuario user4=new Usuario("enzoEvalentina", 3000);

        ArrayList<Usuario> mapaUser=new ArrayList<>();

        mapaUser.add(user1);
        mapaUser.add(user2);
        mapaUser.add(user3);
        mapaUser.add(user4);

        List<Usuario> usuariosLista= mapaUser.stream().filter(u -> u.getPontos() > 10000).collect(Collectors.toList());
        System.out.println("==============");

        System.out.println(usuariosLista.toString());
        System.out.println("==============");

        mapaUser.stream().filter(u -> u.getNome().contains("a")).forEach(u -> System.out.println(u));
        System.out.println("==============");


    }
}


