package models;

/**
 * Created by gudominguete on 03/08/17.
 */
public interface Autenticacao {

    /**
     * Função utilizada para realizar a autenticação no sistema
     */
    public void autenticacao();

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
     * Função que cria um usuário no sistema
     * @param nome
     * @param login
     * @param senha
     * @return
     */
    public Usuario cadastrarUsuario(String nome, String login, String senha);
}
