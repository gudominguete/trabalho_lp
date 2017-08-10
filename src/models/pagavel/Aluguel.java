package models.pagavel;

import models.Contrato;

/**
 * Created by gudominguete on 05/08/17.
 */
public class Aluguel implements IPagavel{
	
	private Contrato contrato;
	private double valor;
	private boolean quitado;
	
	public Aluguel(Contrato contrato, double valor) {
		super();
		this.contrato = contrato;
		this.valor = valor;
		this.quitado = false;
	}

	@Override
	public double getValor() {
		return this.valor;
	}

	@Override
	public void pagar() {
		this.quitado = true;
	}

	@Override
	public boolean quitado() {
		return this.quitado;
	}

	public Contrato getContrato() {
		return contrato;
	}

}
