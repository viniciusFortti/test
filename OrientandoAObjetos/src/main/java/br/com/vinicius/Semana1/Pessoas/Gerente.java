package br.com.vinicius.Semana1.Pessoas;

public final class Gerente extends Funcionario {

    private String cargo;

    @Override
    public void AtualizaSalario(Long novoSalario){
        this.setSalario(novoSalario * 2);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome= " + this.getNome() + '\'' +
                ", idade= " + this.getIdade() + '\'' +
                ", setor= " + this.getSetor() + '\'' +
                ", salario= " + this.getSalario() +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
