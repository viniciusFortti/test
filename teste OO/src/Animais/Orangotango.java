package Animais;

public class Orangotango extends Macacos {

    private Double altura;

    public void dadosAnimais() {
        System.out.println("----------");
        System.out.println(Orangotango.class.getName());
        System.out.println(raça);
        System.out.println(getPeso());
        System.out.println(som);
        System.out.println(altura);
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
