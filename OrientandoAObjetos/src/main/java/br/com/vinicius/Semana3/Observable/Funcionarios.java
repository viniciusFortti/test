package br.com.vinicius.Semana3.Observable;

import java.util.Observable;
import java.util.Observer;

public class Funcionarios implements Observer {

    public String nome;
    public String setor;
    private Observable loja;
    private String novoItem;

    public Funcionarios(Observable loja, String nome, String setor) {
        this.loja=loja;
        this.setor=setor;
        this.loja.addObserver(this);
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor=setor;
    }


    @Override
    public void update(Observable lojaSub, Object o) {
        if (lojaSub instanceof Loja) {
            Loja loja=(Loja) lojaSub;
            novoItem=loja.getItem();
            System.out.println("-----------------");
            System.out.println(
                    "Funcionario " +
                    this.nome + " do setor " + this.setor +
                    " Chegou nas lojas o " + novoItem);
        }
    }
}
