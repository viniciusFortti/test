package Animais;

import javax.swing.*;

public final class FinalJ{


    protected final String nome;
    protected final int idade;
    protected final JButton botao = new JButton("rotulo do botao");
    protected final int[] vetor;

    public FinalJ(){
        idade = 20;
        nome = "UTFPR-CP";
        vetor = new int[100];
    }


    public final void Imprime(final int posicao) {
        System.out.println(vetor[posicao]);
    }

    public final void inicializa() {
        for (int w = 0; w < vetor.length; w++) {
            vetor[w] = w * 9;
        }
        botao.setText("novo rotulo do botao");
        System.out.println(vetor);
    }
}
