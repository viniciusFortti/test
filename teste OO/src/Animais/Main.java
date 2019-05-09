package Animais;

import Animais.Mamiferos;

public class Main {

    //Metodo main no mesmo package.
    //Acesso a public e protected
    //Sem acesso a private
    public static void main(String[] args) {

        Mamiferos m = new Mamiferos();
        m.raça = "cão"; //public
        m.setPeso(10.6);  //private
        m.som = ("au au"); //protected
        m.dadosAnimais();

        //Herança de Animais
        Macacos macaco = new Macacos();
        macaco.som = ("uaa uaa");
        macaco.raça = ("bugio");
        macaco.setPeso(10.6);
        macaco.alturaPulo = 2.5;
        macaco.dadosAnimais();
    }

}
