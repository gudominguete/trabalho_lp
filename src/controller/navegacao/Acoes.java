package controller.navegacao;

import java.util.List;
import java.util.Scanner;

import models.Endereco;
import models.Imobiliaria;
import models.Imovel;
import models.Proprietario;

// Tornar Singleton
public class Acoes {
	
	private static Acoes INSTANCIA = new Acoes();
	
	private Acoes() {}
	
	public static Acoes getInstance() {
		return INSTANCIA;
	}
	
	private Imobiliaria imobiliaria = new Imobiliaria("", "", "");
	private Proprietario proprietario = new Proprietario("", "", "");
	
	Scanner sc = new Scanner(System.in);
	
	private String readLine(String descricao, boolean obrigatorio) {

		System.out.println(descricao);
		String valor = sc.nextLine();
		
		if(obrigatorio){
			while(valor.isEmpty()){
				System.out.println("Essa informação não pode ser deixada em branco.");
				valor = sc.nextLine();
			}
		}
		
		return valor;

	}
	
	public void listarImoveisImobiliaria(){
		imobiliaria.getListaImoveis();
	}
	
	public Imovel cadastrarImovel() {
		
		Imovel novoImovel = new Imovel();

		System.out.println("Cadastro de imóveis");
		System.out.println("Por favor, preencha os dados de endereço");

		String rua = readLine("Informe a rua:", true);

		String numero = readLine("Informe o número:", true);

		String bairro = readLine("Informe o bairro:", true);

		String complemento = readLine("Informe o complemento:", false);

		String municipio = readLine("Informe o município:", true);

		String uf = readLine("Informe a UF:", true);
		
		Endereco endereco = new Endereco(rua, numero, complemento, bairro, municipio, uf);
		
		novoImovel.setEndereco(endereco);
		
		// inserir na lista do proprietario
		
		imobiliaria.inserirImovel(novoImovel);
		
		return novoImovel;

	}
	
	public List<Imovel> listarImoveisProprietario() {
		return proprietario.getListaImoveis();
	}
	
	public void login() {
		System.out.println("Realizando login");
	}
	
	public void cadastrarUsuario() {
		System.out.println("Cadastrando usuário");
	}
	
	public void alterarSenha() {
		
		System.out.println("Alteração de senha");
//		System.out.println("Por favor, preencha os dados de endereço");

		String nomeUsuario = readLine("Informe o nome de usuário:", true);
		
//		Se não existe usuário, retornar
		
		String senhaAtual = readLine("Informe a senha atual:", true);
		
//		Se senha estiver errada, retornar
		
		String novaSenha = readLine("Informe a nova senha:", true);
		
		String confirmacaoNovaSenha = readLine("Confirme a nova senha:", true);
		
		if(!confirmacaoNovaSenha.equals(novaSenha)){
//			Mensagem
		}
		
//		Senha alterada com sucesso

	}
	
	public void logout() {
		System.out.println("Realizando logout");
	}

}
