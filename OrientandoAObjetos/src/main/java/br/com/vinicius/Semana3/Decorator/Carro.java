package br.com.vinicius.Semana3.Decorator;

abstract class Carro {

    private String cor;
    private String modelo;

    public abstract void andar();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor=cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo=modelo;
    }



}
