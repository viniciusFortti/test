package br.com.vinicius.Semana2.Clonagem;


import java.util.*;

public class Main1 {

    public static void main(String[] args) {

        // Original Object
        ClonadoShallow stud = new ClonadoShallow("Johnathan", "Algebra");
        System.out.println("Objeto original: " + stud.getName() + " - "
                + stud.getOriginal().getName());
        // Clone Object
        ClonadoShallow clonedStud = (ClonadoShallow) stud.clone();
        System.out.println("Objeto clonado: " + clonedStud.getName() + " - "
                + clonedStud.getOriginal().getName());
        stud.setName("Daniel");
        stud.getOriginal().setName("Physics");
        System.out.println("Objeto original depois que ele é atualizado: "
                + stud.getName() + " - " + stud.getOriginal().getName());
        System.out.println("Objeto clonado depois de atualizar o objeto original: "
                + clonedStud.getName() + " - "
                + clonedStud.getOriginal().getName());
    }
}


