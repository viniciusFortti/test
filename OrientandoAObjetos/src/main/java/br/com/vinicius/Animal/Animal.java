package br.com.vinicius.Animal;


import java.util.ArrayList;
import java.util.List;

public class Animal {

    private String raça;
    private String pais;
    private Boolean extinção;
    private List<Animal> list = new ArrayList<>();

    public void fazerBarulho(){
        System.out.println("Som de animal");

    }

    public void animaisExtintos(Animal animal){

        if(animal.getExtinção() == true) {
            if( !list.contains(animal.getRaça().toString())) {
                list.add(animal);
                list.forEach(animal1 -> System.out.println(list.toString()));
            }
        }
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Boolean getExtinção() {
        return extinção;
    }

    public void setExtinção(Boolean extinção) {
        this.extinção = extinção;
    }

    public List<Animal> getList() {

        return list;
    }

    public void setList(List<Animal> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "raça='" + raça + '\'' +
                ", pais='" + pais + '\'' +
                ", extinção=" + extinção +
                '}';
    }
}
