package models;

import java.util.Date;

/**
 * Created by gudominguete on 03/08/17.
 */
public class Pessoa extends Usuario {

    private String cpf;
    private Date dataNascimento;
    private String rg;
    private String telefone;

    /**
     * Construtor da classe Pessoa
     * @param nome
     * @param login
     * @param senha
     */
    public Pessoa(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    /**
     * Método que retorna o cpf da pessoa
     * @return
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Método que muda o cpf da pessoa
     * @param cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Método que retorna a data de nascimento da pessoa
     * @return
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Método que altera a data de nascimento da pessoa
     * @param dataNascimento
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * Método que retorna o RG da pessoa
     * @return
     */
    public String getRg() {
        return rg;
    }

    /**
     * Método que altera o rg da pessoa
     * @param rg
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * Método que retorna o telefone da pessoa
     * @return
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Método para alterar o telefone da pessoa
     * @param telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



}
