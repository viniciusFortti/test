package br.com.vinicius.Semana1.Interface;

public class Carros implements Carro {

    private String nome;
    private String marca;
    private Long ano;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getAno() {
        return ano;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }

    @Override
    public void girarRodas(String string){
        System.out.println("sobre escrito");
    }

    @Override
    public String toString() {
        return "Carros{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                '}';
    }

    public static void main(String[] args) {
        Carros carro = new Carros();
        carro.girarRodas("ainda sobre escrito?");
    }

}
