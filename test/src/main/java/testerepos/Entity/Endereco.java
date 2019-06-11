package testerepos.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ENDERECO")
public class Endereco {

    @Id
    @SequenceGenerator(allocationSize = 1, name = "ENDERECO_SEQ", sequenceName = "ENDERECO_SEQ")
    @GeneratedValue(generator = "ENDERECO_SEQ", strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(nullable = false, name = "LOGRADOURO")
    private String logradouro;

    @Column(nullable = false, name = "BAIRRO")
    private String bairro;

    @Column(nullable = false, name = "NUMERO")
    private Integer numero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
