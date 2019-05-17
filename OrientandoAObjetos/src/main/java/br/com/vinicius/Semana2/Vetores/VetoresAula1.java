package br.com.vinicius.Semana2.Vetores;



public class VetoresAula1 {

    double[] temperaturas = new double[10];


    public void ImprimiVetor(){
        for (int i = 0; i < temperaturas.length; i++){
            System.out.println("temperatura do dia " + (i+1) + " é : " + temperaturas[i]);
        }
    }
}
