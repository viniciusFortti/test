package br.com.vinicius.Semana1.ingresso;

public class Vip extends Ingresso {

    private Long valorAdicional;

    @Override
    public void imprimeValor() {
        this.setValorBRL(getValorBRL() + valorAdicional );
    }

    public Long getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Long valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "valor:" + valorAdicional +
                '}';
    }
}
