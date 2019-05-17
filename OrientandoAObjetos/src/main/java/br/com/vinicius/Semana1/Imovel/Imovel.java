package br.com.vinicius.Semana1.Imovel;

public abstract class Imovel  {

    private String endereco;
    private Long valor;

    public void calculaValor(){}

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "endereco='" + endereco + '\'' +
                ", valor=" + valor +
                '}';
    }
}

