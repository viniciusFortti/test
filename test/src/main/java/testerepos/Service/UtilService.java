package testerepos.Service;

import testerepos.DTO.UsuarioDTO;
import testerepos.Entity.Usuario;

public class UtilService {

    public static boolean validarUsuario(Usuario usuario){
        boolean validaIdade = usuario.getIdade() > 0;
        boolean validaNome = usuario.getNome() != null && !usuario.getNome().isEmpty() ;

        boolean valido = validaIdade && validaNome ? true : false;

        return valido;
    }
    public static boolean validarUsuarios2(Usuario usuario){

        boolean valido = (usuario.getIdade()) > 0 && ( usuario.getNome() != null && !usuario.getNome().isEmpty());

        return valido;
    }

    public static boolean valida(Usuario u){
        if (u.getNome() != null){
            if (!u.getNome().isEmpty())
                 if (u.getIdade() > 0){
                      return true;
                  }
            }
        return false;
        }
}
