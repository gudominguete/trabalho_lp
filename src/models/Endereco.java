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

	/**
	 * Construtor da classe Endereco
	 * @param rua
	 * @param numero
	 * @param complemento
	 * @param bairro
	 * @param municipio
	 * @param uf
	 */
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

	/**
	 * Método de retorno da rua do endereço
	 * @return
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * Método para alterar a rua do endereco
	 * @param rua
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

	/**
	 * Método para buscar o numero do endereco
	 * @return
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Método para alterar o numero do endereco
	 * @param numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Método de retorno do complemento
	 * @return
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * Método para alterar o complemento
	 * @param complemento
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * Método de retorno do bairro
	 * @return
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * Método para alterar o bairro
	 * @param bairro
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * Método para retorno do municipio do endereco
	 * @return
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * Método para alterar o municipio
	 * @param municipio
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	/**
	 * Método de retorno do UF
	 * @return
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * Método para alterar o UF
	 * @param uf
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * Método para imprimir um endereço
	 * @return
	 */
	@Override
	public String toString(){
		return rua + ", "+ numero + " - " + bairro + "\n"
				+ municipio + " - " + uf;
	}
}
