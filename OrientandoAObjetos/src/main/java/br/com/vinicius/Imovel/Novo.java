package br.com.vinicius.Imovel;

public class Novo extends Imovel {

    private Long valorAdicional;

    @Override
    public void calculaValor() {
        this.setValor(getValor() + valorAdicional);
    }

    public Long getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Long valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
