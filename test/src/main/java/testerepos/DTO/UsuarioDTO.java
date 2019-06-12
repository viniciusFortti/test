package testerepos.DTO;

import testerepos.Entity.Usuario;

public class UsuarioDTO {

    private String nome;
    private int idade;

    public Usuario transformaParaObjeto(){
        return new Usuario(nome, idade);
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

    public String getNome() {return nome;}
}
