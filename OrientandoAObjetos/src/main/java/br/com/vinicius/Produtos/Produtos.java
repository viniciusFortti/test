package br.com.vinicius.Produtos;

public abstract class Produtos  {

    private String nomeLoja;
    private Long preco;
    private String descrição;

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public Long getPreco() {
        return preco;
    }

    public void setPreco(Long preco) {
        this.preco = preco;
    }

    public String getDescrição() {
        return "Produto de informática";
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}
