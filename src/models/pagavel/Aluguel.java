package models.pagavel;

import models.Contrato;

/**
 * Created by gudominguete on 05/08/17.
 */
public class Aluguel implements IPagavel{
	
	private Contrato contrato;
	private double valor;
	private boolean quitado;

	/**
	 * Construtor da classe
	 * @param contrato
	 * @param valor
	 */
	public Aluguel(Contrato contrato, double valor) {
		super();
		this.contrato = contrato;
		this.valor = valor;
		this.quitado = false;
	}

	/**
	 * Método para imprimir o aluguel
	 * @return
	 */
	@Override
	public String toString(){
		return contrato + " \n valor: "+valor + " \n quitado: " + quitado;
	}

	/**
	 * Método para retornar o valor do aluguel
	 * @return
	 */
	@Override
	public double getValor() {
		return this.valor;
	}

	/**
	 * Método para pagar o aluguel
	 */
	@Override
	public void pagar() {
		this.quitado = true;
	}

	/**
	 * Método para verificar se o aluguel foi pago
	 * @return
	 */
	@Override
	public boolean quitado() {
		return this.quitado;
	}

	/**
	 * Método para buscar o contrato do aluguel
	 * @return
	 */
	public Contrato getContrato() {
		return contrato;
	}

}
