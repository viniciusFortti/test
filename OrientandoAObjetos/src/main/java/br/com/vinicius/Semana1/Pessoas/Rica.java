package br.com.vinicius.Semana1.Pessoas;

public class Rica extends Pessoas {

    private Long dinheiro;

    public String fazCompras(long valorCompra){
        this.dinheiro -= valorCompra;
        return ("fazendo compras");
    }

    public Long getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Long dinheiro) {
        this.dinheiro = dinheiro;
    }

    @Override
    public String toString() {
        return "Rica{" +
                "nome='" + this.getNome() + '\'' +
                ", idade=" + this.getIdade() +
                ", dinheiro=" + dinheiro +
                '}';
    }
}
