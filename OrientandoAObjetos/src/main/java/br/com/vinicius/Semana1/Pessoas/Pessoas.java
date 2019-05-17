package br.com.vinicius.Semana1.Pessoas;

public abstract class Pessoas {

    private String nome;
    private int idade;

    protected void fazerAniversario() {
        idade = idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "classe : " + this.getClass().getSimpleName() + "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
