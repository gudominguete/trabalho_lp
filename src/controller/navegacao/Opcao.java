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

}
