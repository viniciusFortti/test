package br.com.vinicius.Semana2.Vetores;


import java.util.Arrays;

public class VetoresAula1 {

    private String[] elementos = new String[10];

    private int tamanho;

    public VetoresAula1 (int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

   /* public void adiciona(String elemento){
        for(int i = 0; i < elementos.length; i++){
            if (this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/

 /*  public void adiciona(String elemento) throws Exception {
       if(this.tamanho > this.elementos.length) {
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
       }

       else {throw new Exception("Esta cheio");}

   }
*/


    public boolean adiciona(String elemento) {
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho ++;
            return true;
        }else{
            return false;
        }
    }


    public boolean adiciona(String elemento, int posicao) {


        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("posição nao existe");

        }
        for (int i = tamanho - 1; i >= posicao; i--){
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

         return true;
    }


    public void ImprimirVetor(){
        for (int i=0;i < this.elementos.length; i++) {
            System.out.println(elementos[i]);
        }

    }

    public int ImprimirTamanho(){

            return this.tamanho;

    }

    @Override
    public String toString() {
        return "VetoresAula1{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamanho=" + tamanho +
                '}';
    }
}

