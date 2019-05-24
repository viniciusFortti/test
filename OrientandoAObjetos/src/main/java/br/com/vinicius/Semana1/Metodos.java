package br.com.vinicius.Semana1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Metodos {

    private Integer nome;
    public List<String> nomes= new ArrayList<>();

    public static void atualizaSalario(double acrescimo, double salario) {
        acrescimo = (acrescimo / 100) * salario;
        salario += acrescimo;

        System.out.println("salario :" + salario);

    }

    public Integer getNome() {
        return nome;
    }

    public void setNome(Integer nome) {
        this.nome = nome;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    public static boolean verificaNumeroPositivo(float numero){
        boolean boo;
        if (numero > 0){ System.out.println("valor positivo");return true;}

        else {System.out.println("valor negativo");return false;}
    }

    public static void verificaNulo(float numero){
        if(numero == 0) {System.out.println("valor nulo");}

        else{System.out.println("nao é nulo");}
    }

    public static void calculaIdade(int anoNascimento,int anoAtual){
        int idade =  anoAtual - anoNascimento;
        System.out.println("a idade do cliente é :" + idade + " anos");

    }

    public static void buscaNome(String nome, List list){
        if (list.contains(nome)){
            System.out.println("contem");
        }else {
            System.out.println("nao contem");
        }
    }

    public static void organizaNome(List<String> list){
        System.out.println(list.toString());
    }
}
