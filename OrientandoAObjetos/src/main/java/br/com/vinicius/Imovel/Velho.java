package br.com.vinicius.Imovel;

public class Velho extends Imovel{

    private Long desconto;

    @Override
    public void calculaValor(){
        this.setValor(getValor() - desconto);
    }

    public Long getDesconto() {
        return desconto;
    }

    public void setDesconto(Long desconto) {
        this.desconto = desconto;
    }
}
