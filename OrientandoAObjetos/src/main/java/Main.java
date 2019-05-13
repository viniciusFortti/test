import br.com.vinicius.Abstract.FuncionarioAbs;
import br.com.vinicius.Animal.Cao;
import br.com.vinicius.Animal.Jacare;
import br.com.vinicius.Imovel.Imovel;
import br.com.vinicius.Imovel.Novo;
import br.com.vinicius.Imovel.Velho;
import br.com.vinicius.Interface.Mazda;
import br.com.vinicius.Pessoas.*;
import br.com.vinicius.ingresso.*;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Funcionario p1 = new Funcionario();
        p1.setNome("Jose");
        p1.setIdade(55);
        p1.setSalario(1000l);
        p1.setSetor("compras");
        p1.AtualizaSalario(5000l);


        System.out.println(p1.toString());

        Gerente p2 = new Gerente();
        p2.setNome("uilson");
        p2.setIdade(30);
        p2.setSalario(2000l);
        p2.setSetor("Gerencia");
        p2.setCargo("gerente");
        p2.AtualizaSalario(3000l);

        System.out.println(p2.toString());

        Rica p3 = new Rica();
        p3.setNome("Inacio");
        p3.setIdade(27);
        p3.setDinheiro(300000000l);
        p3.fazCompras(300000000l);

        System.out.println(p3.toString());

        Pobre p4 = new Pobre();
        p4.setNome("JAYVERSOWN");
        p4.setIdade(23);
        p4.trabalha();

        System.out.println(p4.toString());

        Miseravel p5 = new Miseravel();
        p5.setNome("Edigle");
        p5.setIdade(79);
        p5.mendiga();

        System.out.println(p5.toString());

        System.out.println("------------------------------");
        System.out.println("ingressos");


        Ingresso in1 = new Normal();
        in1.setValorBRL(50l);
        in1.imprimeValor(4);
        System.out.println(in1.toString());

        Vip in2 = new Vip();
        in2.setValorAdicional(200l);
        in2.imprimeValor();

        System.out.println(in2.toString());

        Camarote in3 = new CamaroteInferior();
        in3.setValorAdicional(350l);
        in3.setLocalizaçao("3B");
        in3.imprimeValor();

        System.out.println(in3.toString());

        CamaroteSuperior in4 = new CamaroteSuperior();
        in4.setValorAdicional(600l);
        in4.setLocalizaçao("o mais alto");
        in4.imprimeValor();

        System.out.println(in4.toString());

        System.out.println("----------------------");
        System.out.println("Imoveis");

        Novo im1 = new Novo();
        im1.setEndereco("rua dos queros queros, 263 sao geraldo POA");
        im1.setValor(50000l);
        im1.setValorAdicional(3000l);
        im1.calculaValor();

        System.out.println(im1.toString());

        Velho im2 = new Velho();
        im2.setEndereco("rua das caturritas, 2220 sao geraldo POA");
        im2.setValor(40000l);
        im2.setDesconto(2500l);
        im2.calculaValor();

        System.out.println(im2.toString());

        System.out.println("------------------------------");
        System.out.println("carros");

        Mazda m = new Mazda();
        m.setAno(2019l);
        m.setMarca("mitsubishi");
        m.setNome("L1923A");
        m.girarRodas();
        m.desligarCarro();

        System.out.println(m.toString());


        Cao c = new Cao();
        c.setRaça("buldog");
        c.setFome(true);
        c.setPais("brasil");
        c.setExtinção(true);
        c.fazerBarulho();
        c.animaisExtintos(c);
        c.mamar(c);
        Jacare j = new Jacare();

        j.setRaça("alado");
        j.setPais("uruguai");
        j.setExtinção(true);
        j.animaisExtintos(j);
        j.fazerBarulho();

        Jacare j1 = new Jacare();

        j1.setRaça("alado");
        j1.setPais("uruguai");
        j1.setExtinção(true);
        j1.animaisExtintos(j);
        j1.fazerBarulho();






    }

}
