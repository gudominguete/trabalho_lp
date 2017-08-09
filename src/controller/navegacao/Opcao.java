package controller.navegacao;

public class Opcao {
	
	private int id;
		
	private String nome;
	
	private String acao;
	
	private Etapa proximaEtapa;

	public Opcao(int id, String nome, String acao, Etapa proximaEtapa) {
		super();
		this.id = id;
		this.nome = nome;
		this.acao = acao;
		this.proximaEtapa = proximaEtapa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
}
