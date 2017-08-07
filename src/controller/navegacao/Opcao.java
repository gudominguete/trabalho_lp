package controller.navegacao;

public class Opcao {
	
	public int id;
		
	public String nome;
	
	public String acao;
	
	public Etapa proximaEtapa;

	public Opcao(int id, String nome, String acao, Etapa proximaEtapa) {
		super();
		this.id = id;
		this.nome = nome;
		this.acao = acao;
		this.proximaEtapa = proximaEtapa;
	}

}
