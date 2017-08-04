package models;

/**
 * Created by gudominguete on 03/08/17.
 */
public class Usuario implements Autenticacao {

    private String nome;
    private String login;
    private String senha;
    private Boolean logado;

    @Override
    public void autenticacao() {

    }

    @Override
    public void recuperarSenha() {

    }

    @Override
    public void trocarSenha() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getLogado() {
        return logado;
    }

    public void setLogado(Boolean logado) {
        this.logado = logado;
    }
}
