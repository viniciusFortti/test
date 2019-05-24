package br.com.vinicius.Semana1.ingresso;

public class Normal extends  Ingresso{

    public String nome;

    @Override
    public String toString() {
        return "Normal{ valor:"+ this.getValorBRL() + "}";
    }

}
