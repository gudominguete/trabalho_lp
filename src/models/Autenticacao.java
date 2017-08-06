package models;

import enums.TipoUsuario;

/**
 * Created by gudominguete on 03/08/17.
 */
public interface Autenticacao {

    /**
     * Função utilizada para realizar a autenticação no sistema
     */
    public void autenticacao(String login, String senha);

    /**
     * Função utilizada para recuperar a senha de um usuário
     * @return
     */
    public String recuperarSenha();

    /**
     * Função utilizada para trocar a senha do usuário
     * @param senha
     */
    public void trocarSenha(String senha);


    /**
     * Função para cadastrar usuário
     * @param nome
     * @param login
     * @param senha
     * @param tipoUsuario
     * @return
     */
    public Usuario cadastrarUsuario(String nome, String login, String senha, TipoUsuario tipoUsuario);

}
