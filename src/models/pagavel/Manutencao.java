package models.pagavel;

import models.Contrato;

public class Manutencao implements IPagavel {

	private Contrato contrato;
	private double valor;
	private boolean quitado;
	
	private String descricaoServicos;

	/**
	 * Construtor da classe
	 * @param contrato
	 * @param valor
	 * @param descricao
	 */
	public Manutencao(Contrato contrato, double valor, String descricao) {
		super();
		this.contrato = contrato;
		this.valor = valor;
		this.quitado = false;
		this.descricaoServicos = descricao;
	}

	/**
	 * Método para retornar o valor da classe
	 * @return
	 */
	@Override
	public double getValor() {
		return this.valor;
	}

	/**
	 * Método para pagar a manuntenção
	 */
	@Override
	public void pagar() {
		this.quitado = true;
	}

	/**
	 * Método para verificar se a manutenção está paga
	 * @return
	 */
	@Override
	public boolean quitado() {
		return this.quitado;
	}

	/**
	 * Método para retornar o contrato
	 * @return
	 */
	public Contrato getContrato() {
		return contrato;
	}

}
