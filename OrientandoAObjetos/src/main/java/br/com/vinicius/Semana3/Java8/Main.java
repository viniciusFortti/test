package br.com.vinicius.Semana3.Java8;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        Usuario user1=new Usuario("vinicius", 50000);
        Usuario user2=new Usuario("vanda", 2000);
        Usuario user3=new Usuario("ana", 18000);
        Usuario user4=new Usuario("valentina", 3000);

        ArrayList<Usuario> usuariosManipulados = new ArrayList<>();

        usuariosManipulados.add(user1);
        usuariosManipulados.add(user2);
        usuariosManipulados.add(user3);
        usuariosManipulados.add(user4);


        List<Usuario> usuariosLista= usuariosManipulados.stream()
                .filter(u -> u.getPontos() > 10000)
                .collect(Collectors.toList());

        usuariosLista.
                forEach(u -> System.out.println("usuarios com mais de 10000 pontos: " + u.getNome() + " "+ u.getPontos()+ " pontos"));
        System.out.println("==============");

        usuariosManipulados.stream()
                .filter(u -> u.getNome().contains("a"))
                .forEach(u -> System.out.println("usuarios que contem 'a' no nome :" + u));
        System.out.println("==============");

        usuariosManipulados.stream()
                .filter(u -> u.getNome().startsWith("v"))
                .forEach(u -> System.out.println("usuarios que iniciam o nome com 'v' : " +u.toString()));
        System.out.println("==============");

        Stream<Usuario> streamParalela = usuariosManipulados.parallelStream();

        Integer somaPontos = streamParalela.mapToInt(u -> u.getPontos()).reduce(0,(x,y) -> x+y);

        System.out.println("soma dos pontos dos usuarios : " + somaPontos);
        System.out.println("==============");

        usuariosManipulados.stream()
                .filter( u -> u.getNome().startsWith("v"))
                .forEach(u -> u.turnModerator());

        usuariosManipulados.forEach(u -> System.out.println("usuarios  com a letra v tornaram-se moderadores : " + u));
        System.out.println("==============");

    }
}


