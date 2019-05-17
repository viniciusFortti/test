
import br.com.vinicius.Semana2.Autenticador.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionTest {

  @Test(expected = ArquivoDeAutenticacaoInvalidoException.class)
    public  void arquivoNaoExiste(){
      Autenticador a = new Autenticador("naoexiste.txt");

  }

    @Test
    public  void LinhaComQuatroTraços(){
      try {
          Autenticador a = new Autenticador("UsuarioErrado.txt");
          fail("excessao");
      }  catch (ArquivoDeAutenticacaoInvalidoException e){
          assertEquals("Formato invalido:andre-33-33-regular",e.getMessage());
      }
    }

  @Test
  public  void LinhaComUmTraços(){
    try {
      Autenticador a = new Autenticador("UsuarioErrado2");

    }  catch (ArquivoDeAutenticacaoInvalidoException e){
      assertEquals("Formato invalido:b-4none",e.getMessage());
    }
  }

  @Test
  public  void AutenticaUsuario() throws AutenticacaoException {

    Autenticador a = new Autenticador("Usuario.txt");

    Usuario u = a.autenticar("joao","12345");
    assertEquals("admin",u.getPerfil());
    assertEquals("joao",u.getLogin());

  }

  @Test
  public void AutenticaUsuarioInvalido() {

    Autenticador a = new Autenticador("Usuario.txt");
    try{
      Usuario u = a.autenticar("juan","12345");
      fail("excessao");
    }catch (AutenticacaoException e){
      assertEquals(true, e instanceof UsuarioInvalidoException);
      assertEquals("juan", e.getLogin());
    }


  }

  @Test
  public void AutenticaUsuarioSenhaInvalida() throws AutenticacaoException {

    Autenticador a = new Autenticador("Usuario.txt");
    try{
      Usuario u = a.autenticar("joao","12345598");
      fail("excessao");
    }catch (SenhaInvalidaException e){

      assertEquals("joao", e.getLogin());
      assertEquals("12345598", e.getSenha());
    }


  }

  @Test
  public void AutenticaUsuarioPerfilInvalido() throws AutenticacaoException {

    Autenticador a = new Autenticador("Usuario.txt");
    try{
      Usuario u = a.autenticar("antonia","23424");
      fail("excessao");
    }catch (PerfilDeUsuarioInvalidoException e){

      assertEquals("antonia", e.getUser().getLogin());
      assertEquals("none", e.getUser().getPerfil());


    }


  }
}
