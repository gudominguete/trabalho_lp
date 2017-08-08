package models;

import java.util.List;

/**
 * Created by gudominguete on 05/08/17.
 */
public class Proprietario extends Pessoa{

    private List<Imovel> listaImoveis;

	/**
	 * Construtor da classe proprietario
	 * @param nome
	 * @param login
	 * @param senha
	 */
    public Proprietario(String nome, String login, String senha) {
        super(nome, login, senha);
    }

	/**
	 * Método de retorno da lista de imoveis de um proprietario
	 * @return
	 */
	public List<Imovel> getListaImoveis() {
		return listaImoveis;
	}

	/**
	 * Método para trocar a lista de imoveis do proprietario
	 * @param listaImoveis
	 */
	public void setListaImoveis(List<Imovel> listaImoveis) {
		this.listaImoveis = listaImoveis;
	}
}
