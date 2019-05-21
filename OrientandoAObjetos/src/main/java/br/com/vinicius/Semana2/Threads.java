package br.com.vinicius.Semana2;

import java.lang.reflect.InvocationTargetException;
public class Threads {

        /**
         * @param args
         * @throws InvocationTargetException
         * @throws InterruptedException
         */
        public static void main(String[] args) throws InterruptedException, InvocationTargetException {
            Thread t1 = new Thread() {
                @Override
                public void run() {
                    for(int i = 0; i < 500; i++)
                        System.out.println(i+": t1");
                }

            };

            Thread t2 = new Thread() {
                @Override
                public void run() {
                    for(int i = 0; i < 500; i++)
                        System.out.println(i+": t2");
                }

            };
            t1.start();

            t1.setPriority(Thread.MAX_PRIORITY);
            t2.setPriority(Thread.MIN_PRIORITY);
            System.out.println(t2.getState());
            System.out.println(t1.getState());
            t2.start();

            System.out.println("THREADS ATIVAS = "+Thread.activeCount());

            System.out.println("NOME THREAD MAIN: " + Thread.currentThread().getName() + " | isAlive: "
                    + Thread.currentThread().isAlive());
            System.out.println("NOME THREAD T1: " + t1.getName() + " | isAlive: "
                    + t1.isAlive());
            System.out.println("NOME THREAD T2: " + t2.getName() + " | isAlive: "
                    + t2.isAlive());
        }

    }
