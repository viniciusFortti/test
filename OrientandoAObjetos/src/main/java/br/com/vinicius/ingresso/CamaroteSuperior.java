package br.com.vinicius.ingresso;

public class CamaroteSuperior extends Camarote{

    @Override
    public String toString() {
        return "CamaroteSuperior{" +
                "localizaçao:'" + this.getLocalizaçao() + '\'' +
                ", valor:" + this.getValorBRL() +
                '}';
    }
}
