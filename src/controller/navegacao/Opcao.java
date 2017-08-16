package controller.navegacao;

public class Opcao {
	
	private String nome;
	
	private String acao;
	
	private String parametrosAcao;
	
	private Etapa proximaEtapa;

	/**
	 * Construtor da classe
	 * @param nome
	 * @param acao
	 * @param proximaEtapa
	 */
	public Opcao(String nome, String acao, Etapa proximaEtapa) {
		super();
		this.nome = nome;
		this.acao = acao;
		this.proximaEtapa = proximaEtapa;
	}

	/**
	 * Método para retornar o nome do objeto
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Método para alterar o nome da opção
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Método para retornar a ação da opção
	 * @return
	 */
	public String getAcao() {
		return acao;
	}

	/**
	 * Método para alterar a ação da opção
	 * @param acao
	 */
	public void setAcao(String acao) {
		this.acao = acao;
	}

	/**
	 * Método para buscar a proxima etapa
	 * @return
	 */
	public Etapa getProximaEtapa() {
		return proximaEtapa;
	}

	/**
	 * Método para alterar a próxima etapa
	 * @param proximaEtapa
	 */
	public void setProximaEtapa(Etapa proximaEtapa) {
		this.proximaEtapa = proximaEtapa;
	}

	/**
	 * Método para buscar os parametros da ação
	 * @return
	 */
	public String getParametrosAcao() {
		return parametrosAcao;
	}

	/**
	 * Método para alterar os parametros da ação
	 * @param parametrosAcao
	 */
	public void setParametrosAcao(String parametrosAcao) {
		this.parametrosAcao = parametrosAcao;
	}

}
