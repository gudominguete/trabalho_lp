package models;

import java.util.List;

import models.pagavel.IPagavel;

public final class Contrato {
	
	private static int ID_CONTRATO = 0;
	
	private int id;
	
	private Imovel imovel;
	
	private Locatario locatario;
	
	private List<IPagavel> cobrancas;

	public Contrato(Imovel imovel, Locatario locatario) {
		super();
		this.id = Contrato.ID_CONTRATO++;
		this.imovel = imovel;
		this.locatario = locatario;
	}

	@Override
	public String toString(){
		return imovel + " + " + locatario.getNome();
	}
	
	public int getId() {
		return this.id;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public Locatario getLocatario() {
		return locatario;
	}

	public List<IPagavel> getCobrancas() {
		return cobrancas;
	}
	
	public void adicionarCobranca(IPagavel cobranca) {

		this.cobrancas.add(cobranca);

	}

}
