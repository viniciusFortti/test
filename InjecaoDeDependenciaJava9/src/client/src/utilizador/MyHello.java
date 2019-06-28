package utilizador;


import traductPackage.Tradutor;

import java.util.ServiceLoader;

public class MyHello {

    public static void main(String[] args) {System.out.println("start");

    ServiceLoader<Tradutor> hello = ServiceLoader.load(Tradutor.class);

    for (Tradutor iMyHello : hello) {System.out.println(hello);}

    hello.stream().map(a -> a.get().hello("Mike")).forEach(a-> System.out.println("\t"+a));
    }
}
