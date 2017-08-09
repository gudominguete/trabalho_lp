package controller.navegacao;

import java.util.List;
import java.util.Scanner;

import controller.BancoDeDados;
import models.*;

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

		String login = readLine("Informe a login:", true);

		String senha = readLine("Informe o senha:", true);

		System.out.println("Realizando login");
		for(Usuario usuario: BancoDeDados.usuarios){

			if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)){

				System.out.println(usuario.getNome());
			}
		}
	}
	
	public void cadastrarImobiliaria() {

		System.out.println("Cadastrando Imobiliaria");

		String nome = readLine("Informe a nome:", true);

		String login = readLine("Informe o login:", true);

		String senha = readLine("Informe o senha:", true);


		Imobiliaria imobiliaria = new Imobiliaria(nome, login, senha);

		BancoDeDados.usuarios.add(imobiliaria);
	}

	public void cadastrarProprietario() {

		System.out.println("Cadastrando proprietario");

		String nome = readLine("Informe a nome:", true);

		String login = readLine("Informe o login:", true);

		String senha = readLine("Informe o senha:", true);


		Proprietario proprietario = new Proprietario(nome, login, senha);

		BancoDeDados.usuarios.add(proprietario);
	}

	public void cadastrarLocatario() {

		System.out.println("Cadastrando locatario");

		String nome = readLine("Informe a nome:", true);

		String login = readLine("Informe o login:", true);

		String senha = readLine("Informe o senha:", true);


		Locatario locatario = new Locatario(nome, login, senha);

		BancoDeDados.usuarios.add(locatario);
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

	public void exit(){
		System.exit(0);
	}

}
