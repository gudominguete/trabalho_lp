package models;

import enums.TipoUsuario;

public class Locatario extends Pessoa {

    /**
     * Construtor da classe locatario
     * @param nome
     * @param login
     * @param senha
     */
    public Locatario(String nome, String login, String senha) {
        super(nome, login, senha);
        this.tipo = TipoUsuario.LOCATARIO;
    }
}
