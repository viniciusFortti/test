package ItaTradu;

import java.text.MessageFormat;

import traductPackage.Tradutor;

public class MyITHello implements Tradutor {

    @Override
    public String hello(String name) {
        return MessageFormat.format("Ciao {0}",name);
    }

    public static MyITHello provider() {
        System.out.println("MyITHello called");
        return new MyITHello();
    }
}

