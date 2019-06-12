package testerepos.Entity;

import javax.persistence.*;

@Entity
@Table(name = "USUARIO")

public class Usuario {

    @Id
    @SequenceGenerator(allocationSize = 1, name = "USUARIO_SEQ", sequenceName = "USUARIO_SEQ")
    @GeneratedValue(generator = "USUARIO_SEQ", strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(nullable = false,name = "NOME")
    private String nome;

    @Column(nullable = false,name = "IDADE")
    private int idade;

    @Column(nullable = false,name = "ADMIN")
    private boolean admin;

    public Usuario(){}

    public Usuario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }
}
