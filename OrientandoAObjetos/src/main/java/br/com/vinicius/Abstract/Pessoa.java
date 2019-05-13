package br.com.vinicius.Abstract;

public abstract class Pessoa {

    public String nome;
    public static long idade = 22;
    public double altura;
    private static int total = 0;

    Pessoa(){
        total++;
        System.out.println("Objeto Existem "+total+" objetos dessa classe");
    }
    abstract void verPessoa();


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    

}
