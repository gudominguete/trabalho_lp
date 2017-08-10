package controller.navegacao;

public class Opcao {
	
	private String nome;
	
	private String acao;
	
	private String parametrosAcao;
	
	private Etapa proximaEtapa;

	public Opcao(String nome, String acao, Etapa proximaEtapa) {
		super();
		this.nome = nome;
		this.acao = acao;
		this.proximaEtapa = proximaEtapa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public Etapa getProximaEtapa() {
		return proximaEtapa;
	}

	public void setProximaEtapa(Etapa proximaEtapa) {
		this.proximaEtapa = proximaEtapa;
	}

	public String getParametrosAcao() {
		return parametrosAcao;
	}

	public void setParametrosAcao(String parametrosAcao) {
		this.parametrosAcao = parametrosAcao;
	}

}
