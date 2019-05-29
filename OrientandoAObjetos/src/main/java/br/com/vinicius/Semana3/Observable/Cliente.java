package br.com.vinicius.Semana3.Observable;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private Observable loja;
    public String email;
    private String novoItem;

    public Cliente(Observable loja, String email){
        this.loja = loja;
        this.loja.addObserver(this);
        this.email = email;
    }

    @Override
    public void update(Observable lojaSub, Object o) {
        if(lojaSub instanceof  Loja) {
            Loja loja = (Loja) lojaSub;
            novoItem = loja.getItem();
            System.out.println("-----------------");
            System.out.println("Atençao, Chegou as nossas lojas o novo " + novoItem + " " + this.email);
        }
    }
}
