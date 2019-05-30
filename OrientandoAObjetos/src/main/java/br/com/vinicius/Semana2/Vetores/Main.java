package br.com.vinicius.Semana2.Vetores;

import br.com.vinicius.Semana2.*;
import br.com.vinicius.Semana2.Autenticador.Usuario;

import java.util.*;


public class Main {

    public  synchronized static void main(String[] args){
/*
        VetoresAula1 vetor=new VetoresAula1(8);

        Scanner ler=new Scanner(System.in);

       vetor.adiciona("este é o primeiro");
        vetor.adiciona("b");
        vetor.adiciona("c");
        vetor.adiciona("c");
        vetor.adiciona("c");
        vetor.adiciona("s");
        vetor.adiciona("f");
        vetor.adiciona("fc");

     System.out.println(vetor.toString());

        VetoresAula1 vetor2=new VetoresAula1(8);


        vetor2.adiciona("este é o segundo");
        vetor2.adiciona("b");
        vetor2.adiciona("c");
        vetor2.adiciona("c");
        vetor2.adiciona("c");
        vetor2.adiciona("s");
        vetor2.adiciona("f");
        vetor2.adiciona("fc");

        VetoresAula1 vetor3=new VetoresAula1(8);


        vetor3.adiciona("este é o terceiro");
        vetor3.adiciona("b");
        vetor3.adiciona("c");
        vetor3.adiciona("c");
        vetor3.adiciona("c");
        vetor3.adiciona("s");
        vetor3.adiciona("f");
        vetor3.adiciona("fc");

        VetoresAula1 vetor4=new VetoresAula1(8);


        vetor4.adiciona("este é o quarto");
        vetor4.adiciona("b");
        vetor4.adiciona("c");
        vetor4.adiciona("c");
        vetor4.adiciona("c");
        vetor4.adiciona("s");
        vetor4.adiciona("f");
        vetor4.adiciona("fc");


        // vetor.ImprimirVetor();

        //vetor.ImprimirTamanho();

        // vetor.toString();*/
/*
        List<VetoresAula1> listaTest=new ArrayList<>();

        listaTest.add(vetor);
        listaTest.add(vetor2);
        listaTest.add(vetor3);*/
/*
     //   System.out.println(listaTest.toString());

        System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
        int n=listaTest.size();
        for (int i=0; i < n; i++) {
            System.out.printf("Posição %d- %s\n", i, listaTest.get(i));
        }

        System.out.printf("\nInforme a posição a ser excluída:\n");
        int i=ler.nextInt();

        try {
            // [ D ] remove o i-ésimo contato da agenda
            listaTest.remove(i);
        } catch (IndexOutOfBoundsException e) {
            // exceção lançada para indicar que um índice (i)
            // está fora do intervalo válido (de 0 até agenda.size()-1)
            System.out.printf("\nErro: posição inválida (%s).",
                    e.getMessage());
        }

       // System.out.println(listaTest.toString());
        listaTest.add(vetor4);

        // [ E ] mostrando os "n" contatos da agenda (usando for-each)
        System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");
        i=0;
        for (VetoresAula1 vetorPercorre : listaTest) {
            System.out.printf("Posição %d- %s\n", i, vetor);
            i++;

            // [ F ] mostrando os "n" contatos da agenda (com iterator)
            System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
            i=0;
            Iterator<VetoresAula1> iterator=listaTest.iterator();
            while (iterator.hasNext()) {
                System.out.printf("Posição %d- %s\n", i, iterator.next());
                i++;
            }


        }

       listaTest.add(vetor);
        listaTest.remove(2);
        System.out.println(listaTest.indexOf(vetor));*/
/*

        System.out.println(listaTest.toString());

        System.out.println(listaTest.isEmpty());

        System.out.println(listaTest.lastIndexOf(vetor));*/


       /* LinkedList<VetoresAula1> encadeada = new LinkedList<>();


       encadeada.addLast(vetor4);
       encadeada.add(vetor2);
       encadeada.add(vetor3);

        System.out.println(encadeada.toString());
        System.out.println("------------------------");
        System.out.println(encadeada.getFirst());
        System.out.println(encadeada.getLast());
        System.out.println("------------------------");

        encadeada.addFirst(vetor);

        System.out.println(encadeada.toString());
        System.out.println("------------------------");

        Iterator i = encadeada.descendingIterator();

        System.out.println("------------------------");
        System.out.println(encadeada.element());

        encadeada.offer(vetor2);

        System.out.println(encadeada.poll());
        System.out.println("------------------------");
        System.out.println(encadeada.toString());

        System.out.println("------------------------");
        System.out.println(encadeada.pop());

        encadeada.push(vetor);
        System.out.println("------------------------");
        System.out.println(encadeada.toString());

        encadeada.removeFirstOccurrence(vetor2);
        System.out.println("------------------------");
        System.out.println(encadeada.toString());

        encadeada.removeLastOccurrence(vetor2);
        System.out.println("------------------------");
        System.out.println(encadeada.toString());*/
/*
       Queue tstQueue = new PriorityQueue();

       tstQueue.add(1);
       tstQueue.add(2);
       tstQueue.add(3);
       tstQueue.add(4);
       tstQueue.add(5);
       tstQueue.add(6);
       tstQueue.add(7);
*/

        /*System.out.println(tstQueue);
        System.out.println("-------------------");
        tstQueue.remove();
        System.out.println(tstQueue);
        System.out.println("-------------------");
        tstQueue.remove();
        System.out.println(tstQueue);*/

      //  System.out.println(tstQueue.remove());


       /* PriorityQueue<pair<Integer, String>> queuePrioridade = new PriorityQueue();
        queuePrioridade.add(1,"lula");
        queuePrioridade.add(5);
        queuePrioridade.add(3);

         queuePrioridade.comparator();

        System.out.println(queuePrioridade);*/

/*
        TreeSet<Integer> ord = new TreeSet<>();

        ord.add(7);
        ord.add(3);
        ord.add(1);
        System.out.println(ord);

      VetorStatico.VetorStatico2 vetorEst = new VetorStatico.VetorStatico2();

        vetorEst.setA("alagoas");

        System.out.println(vetorEst.toString());


        VetoresAula1 vetores = new VetoresAula1(5);

        System.out.println(vetores);

        String a = new String();

        System.out.println(a);



        VetoresAula1 vetori = new VetoresAula1(10);
        Usuario usu = new Usuario("s","s","s");
        vetori.adiciona("a");

        TreeSet<String> hash = new TreeSet<>();
        hash.add("vinicius");
        hash.add("andre");
        hash.add("marcos");
        System.out.println(hash.toString());

        Hashtable <Integer, String> hash2 = new Hashtable<>();
        hash2.put(7,"kleber");
        hash2.put(20,"jaja");
        hash2.put(3,"vinicius");
        hash2.put(1,"jose");
        hash2.put(500,"a");


        System.out.println(hash2.toString());

        TreeMap<Integer, String> hash3 = new TreeMap<>();
        hash3.put(2,"kleber");
        hash3.put(3,"vinicius");
        hash3.put(1,"jose");
        hash3.put(500,"joao");
        hash3.put(50,null);
        hash3.put(10,"aaa");

        System.out.println(hash3.entrySet());


*/    Double[] ordered =new Double[3];

        ordered[0] = 15d;
        ordered[1] = 7d;
        ordered[2] = 5d;

        for (int i = 0; i < ordered.length; i++){
            for (int j = 0;j< ordered.length - 1;j++) {

                if (ordered[j] > ordered[j + 1]) {
                    double aux;
                    aux=ordered[j];
                    ordered[j]=ordered[j + 1];
                    ordered[j + 1]=aux;
                }
            }
        }for (double numero : ordered) {
            System.out.println(numero);
        }
    }
}


