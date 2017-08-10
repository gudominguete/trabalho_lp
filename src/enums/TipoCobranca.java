package enums;

public enum TipoCobranca {
	
	ALUGUEL(0, "Aluguel"),
	MANUTENCAO(1, "Manutenção");
	
	public int id;
	public String nome;
	
	TipoCobranca(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

}
