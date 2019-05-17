package br.com.vinicius.Semana1.ingresso;

public class Normal extends  Ingresso{

    protected String nome;

    @Override
    public String toString() {
        return "Normal{ valor:"+ this.getValorBRL() + "}";
    }


}
