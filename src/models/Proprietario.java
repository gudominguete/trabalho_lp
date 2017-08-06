package models;

import java.util.List;

/**
 * Created by gudominguete on 05/08/17.
 */
public class Proprietario extends Usuario{

    List<Imovel> listaImoveis;

    public Proprietario(String nome, String login, String senha) {
        super(nome, login, senha);
    }
}
