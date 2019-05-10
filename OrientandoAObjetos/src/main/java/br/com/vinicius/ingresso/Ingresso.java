package br.com.vinicius.ingresso;

public abstract class Ingresso {

    private static Long valorBRL;

    public void imprimeValor(){
        System.out.println(valorBRL);
    }

    public Long getValorBRL() {
        return valorBRL;
    }

    public void setValorBRL(Long valorBRL) {
        this.valorBRL = valorBRL;
    }

    @Override
    public String toString() {
        return "Ingresso{}";
    }
}
