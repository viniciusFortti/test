import Animais.Macacos;
import Animais.Mamiferos;
import Animais.Orangotango;

public class Main {

    //Metodo main fora do Package
    public static void main(String[] args) {

        Mamiferos m = new Mamiferos();
        m.raça = "cão"; //public V
        m.setPeso(10.6); //private X
        m.setSom("au au"); //protected X
        m.dadosAnimais();

        //Herança de Animais
        Macacos macaco = new Macacos();
        macaco.raça = ("bugio"); //public V
        macaco.setSom("uaa uaa"); //private X
        macaco.setPeso(30.5);  //protected X
        macaco.alturaPulo = 2.5;
        macaco.dadosAnimais();

        Orangotango orango = new Orangotango();
        orango.raça = ("vermelho do leste");
        orango.setSom("U u U u !");
        orango.setPeso(656.5);
        orango.alturaPulo = 6.2;
        orango.setAltura(2.3);
        orango.dadosAnimais();
    }

}