package controller.navegacao;

import java.util.ArrayList;
import java.util.List;

public class Etapa {
	
	private int id;
	
	private String nome;
	
	private List<Opcao> opcoes;
	
	private Etapa anterior;

	public Etapa(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		this.opcoes = new ArrayList<Opcao>();
	}

	public List<Opcao> getOpcoes() {
		return opcoes;
	}

	public void setOpcoes(List<Opcao> opcoes) {
		this.opcoes = opcoes;
	}

	public Etapa getAnterior() {
		return anterior;
	}

	public void setAnterior(Etapa anterior) {
		this.anterior = anterior;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
