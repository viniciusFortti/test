package br.com.vinicius.Semana2.Autenticador;

public class Usuario {

    private String login;
    private String senha;
    private String perfil;

    public Usuario(String login, String senha, String perfil) {
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getLogin() {
        return login;
    }

    public boolean verificaSenha(String senha) {
        return this.senha.equals(senha);
    }

    public String getPerfil() {
        return perfil;
    }
}
