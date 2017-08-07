package models;

/**
 * Created by gudominguete on 05/08/17.
 */
public class Endereco {
	
	private String rua;
	
//	O numero pode ser "21A", por exemplo
	private String numero;
	
	private String complemento;
	
	private String bairro;
	
	private String municipio;
	
	private String uf;
	
	public Endereco() {
		super();
	}

	public Endereco(String rua, String numero, String complemento,
			String bairro, String municipio, String uf) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.municipio = municipio;
		this.uf = uf;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
