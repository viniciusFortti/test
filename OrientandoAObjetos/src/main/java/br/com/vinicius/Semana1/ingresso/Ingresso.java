package br.com.vinicius.Semana1.ingresso;

public abstract class Ingresso {

    private static Long valorBRL;

    public void imprimeValor(){
        System.out.println(valorBRL);
    }

    public void imprimeValor(long dolar){ Long valor = valorBRL / dolar; System.out.println(valor); }

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
