package models.pagavel;

import models.Contrato;

public class Manutencao implements IPagavel {

	private Contrato contrato;
	private double valor;
	private boolean quitado;
	
	private String descricaoServicos;
	
	public Manutencao(Contrato contrato, double valor, String descricao) {
		super();
		this.contrato = contrato;
		this.valor = valor;
		this.quitado = false;
		this.descricaoServicos = descricao;
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
