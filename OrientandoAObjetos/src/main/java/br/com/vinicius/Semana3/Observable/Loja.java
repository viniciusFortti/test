package br.com.vinicius.Semana3.Observable;

import java.util.Observable;

public class Loja extends Observable {

    private String itemLançado;

    public void lancaItem(String item){
        this.itemLançado = item;
        setChanged();
        notifyObservers();
    }

    public String getItem(){
        return this.itemLançado;
    }
}
