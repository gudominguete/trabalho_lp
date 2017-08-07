package models;

public class Contrato {
	
	private Imovel imovel;
	
	private Locatario locatario;

	public Contrato(Imovel imovel, Locatario locatario) {
		super();
		this.imovel = imovel;
		this.locatario = locatario;
	}

}
