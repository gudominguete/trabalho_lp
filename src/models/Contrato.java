package models;

import java.util.List;

import models.pagavel.IPagavel;

public final class Contrato {
	
	private static int ID_CONTRATO = 0;
	
	private int id;
	
	private Imovel imovel;
	
	private Locatario locatario;
	
	private List<IPagavel> cobrancas;

	/**
	 * Construtor da classe
	 * @param imovel
	 * @param locatario
	 */
	public Contrato(Imovel imovel, Locatario locatario) {
		super();
		this.id = Contrato.ID_CONTRATO++;
		this.imovel = imovel;
		this.locatario = locatario;
	}

	/**
	 * Método para imprimir o contrato
	 * @return
	 */
	@Override
	public String toString(){
		return imovel + " + " + locatario.getNome();
	}

	/**
	 * Método que retorne o id
	 * @return
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Método para retornar o imovel do contrato
	 * @return
	 */
	public Imovel getImovel() {
		return imovel;
	}

	/**
	 * Método para buscar o locatario do contrato
	 * @return
	 */
	public Locatario getLocatario() {
		return locatario;
	}

	/**
	 * Método para buscar as cobranças
	 * @return
	 */
	public List<IPagavel> getCobrancas() {
		return cobrancas;
	}

	/**
	 * Método para adicionar a cobrança
	 * @param cobranca
	 */
	public void adicionarCobranca(IPagavel cobranca) {

		this.cobrancas.add(cobranca);

	}

}
