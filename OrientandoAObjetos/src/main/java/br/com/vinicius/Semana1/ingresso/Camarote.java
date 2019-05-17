package br.com.vinicius.Semana1.ingresso;

public abstract class Camarote extends Vip {

    private String localizaçao;


    public String getLocalizaçao() {
        return localizaçao;
    }

    public void setLocalizaçao(String localizaçao) {
        this.localizaçao = localizaçao;
    }

    @Override
    public String toString() {
        return "Camarote{" +
                "localizaçao:'" + localizaçao + '\'' +
                "valor:" + this.getValorBRL() +
                '}';
    }
}
