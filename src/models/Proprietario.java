package models;

import java.util.List;

/**
 * Created by gudominguete on 05/08/17.
 */
public class Proprietario extends Pessoa{

    private List<Imovel> listaImoveis;

    public Proprietario(String nome, String login, String senha) {
        super(nome, login, senha);
    }

	public List<Imovel> getListaImoveis() {
		return listaImoveis;
	}

	public void setListaImoveis(List<Imovel> listaImoveis) {
		this.listaImoveis = listaImoveis;
	}
}
