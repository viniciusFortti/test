package br.com.vinicius.Abstract;

public class FuncionarioAbs extends Pessoa {


    @Override
    public void verPessoa() {
        nome = this.nome;
        idade = this.idade;
        altura = this.altura;

        System.out.println(this.toString());
    }
}
