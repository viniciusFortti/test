package br.com.vinicius.Pessoas;

public class Funcionario extends Pessoas {

    private String setor;
    private Long salario;

    public void AtualizaSalario(Long novosalario) {
        salario = novosalario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome= " + this.getNome() + '\'' +
                ", idade= " + this.getIdade() + '\'' +
                ", setor= " + setor + '\'' +
                ", salario= " + salario +
                '}';
    }
}
