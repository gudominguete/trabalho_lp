package models;

import java.util.List;

/**
 * Created by gudominguete on 05/08/17.
 */
public class Imobiliaria extends Usuario {

    private String cnpj;
    private List<Imovel> listaImoveis;

    public Imobiliaria(String nome, String login, String senha) {
        super(nome, login, senha);
    }
}
