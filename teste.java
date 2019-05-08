package test;


import javax.annotation.Generated;

@Entity
public class Pessoas {

    @id
    @SequenceGenerator(allocationSize = 1, name = "PESSOAS_SEQ", SequenceName = "PESSOAS_SEQ")
    @GeneratedValue(generator = "PESSOAS_SEQ", strategy = Generation.Type.SEQUENCE)
    Long id;
    String nome;
    Long cpf;
    Long rg;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getRg() {
        return rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }
}