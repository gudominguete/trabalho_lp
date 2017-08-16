package controller.navegacao;

import java.util.ArrayList;
import java.util.List;

public class Etapa {
	
	private int id;
	
	private String nome;
	
	private List<Opcao> opcoes;
	
	private Etapa anterior;

	/**
	 * Construtor da etapa
	 * @param id
	 * @param nome
	 */
	public Etapa(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		this.opcoes = new ArrayList<Opcao>();
	}

	/**
	 * Método para retornar a lista de opções
	 * @return
	 */
	public List<Opcao> getOpcoes() {
		return opcoes;
	}

	/**
	 * Método para alterar a lista de opções
	 * @param opcoes
	 */
	public void setOpcoes(List<Opcao> opcoes) {
		this.opcoes = opcoes;
	}

	/**
	 * Método para retornar a etapa anterior
	 * @return
	 */
	public Etapa getAnterior() {
		return anterior;
	}

	/**
	 * Método para alterar a etapa anteriorr
	 * @param anterior
	 */
	public void setAnterior(Etapa anterior) {
		this.anterior = anterior;
	}

	/**
	 * Método para retornar o id da etapa
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * Método para alterar o id da etapa
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Método para retornar o nome da etapa
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Método para alterar o nome da etapa
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
}
