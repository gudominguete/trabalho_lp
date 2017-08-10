package controller.navegacao;

import java.util.List;
import java.util.Scanner;

import models.Endereco;
import models.Imovel;
import models.Locatario;
import models.Proprietario;
import models.Usuario;
import controller.BancoDeDados;

public class Acoes {
	
	private static Acoes INSTANCIA = new Acoes();
	
	private Acoes() {}
	
	public static Acoes getInstance() {
		return INSTANCIA;
	}
	
//	private Imobiliaria imobiliaria = new Imobiliaria("");
	private Proprietario proprietario = new Proprietario("", "", "");
	
	public void listarImoveisImobiliaria(){
		System.out.println("Não implementado: listarImoveisImobiliaria");
		BancoDeDados.getImobiliaria().getImoveis();
	}
	
	public List<Imovel> listarImoveisProprietario() {
		System.out.println("Não implementado: listarImoveisProprietario");
		return proprietario.getListaImoveis();
	}
	
	public Imovel cadastrarImovel() {
		
		Imovel novoImovel = new Imovel();

		System.out.println("Cadastro de imóveis");
		System.out.println("Por favor, preencha os dados de endereço");

		String rua = TerminalUtils.readLine("Informe a rua:", true);

		String numero = TerminalUtils.readLine("Informe o número:", true);

		String bairro = TerminalUtils.readLine("Informe o bairro:", true);

		String complemento = TerminalUtils.readLine("Informe o complemento:", false);

		String municipio = TerminalUtils.readLine("Informe o município:", true);

		String uf = TerminalUtils.readLine("Informe a UF:", true);
		
		Endereco endereco = new Endereco(rua, numero, complemento, bairro, municipio, uf);
		
		novoImovel.setEndereco(endereco);
		
		// inserir na lista do proprietario
		
		BancoDeDados.getImobiliaria().inserirImovel(novoImovel);
		
		return novoImovel;

	}
	
	public void gerarCobranca() {
		System.out.println("Não implementado: gerarCobranca");
	}
	
	public void pagarCobranca() {
		System.out.println("Não implementado: pagarCobranca");
	}
	
	public void alugarImovel() {
		System.out.println("Não implementado: alugarImovel");
	}
	
	public void login() {
		
		String login = TerminalUtils.readLine("Informe o login:", true);

		String senha = TerminalUtils.readLine("Informe a senha:", true);
		
		TerminalUtils.clear();

		System.out.println("Realizando login");
		for(Usuario usuario: BancoDeDados.usuarios){

			if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)){
				BancoDeDados.usuarioLogado = usuario;
				System.out.println("Usuário logado: " + usuario.getNome());
			}
		}

	}

	public void cadastrarProprietario() {
		
		System.out.println("Cadastrando proprietario");

		String nome = TerminalUtils.readLine("Informe o nome:", true);

		String login = TerminalUtils.readLine("Informe o login:", true);

		String senha = TerminalUtils.readLine("Informe a senha:", true);

		Proprietario proprietario = new Proprietario(nome, login, senha);

		BancoDeDados.usuarios.add(proprietario);
		
		TerminalUtils.clear();
		
		System.out.println("Proprietário cadastrado com sucesso");

	}

	public void cadastrarLocatario() {
		
		TerminalUtils.clear();

		System.out.println("Cadastrando locatario");

		String nome = TerminalUtils.readLine("Informe o nome:", true);

		String login = TerminalUtils.readLine("Informe o login:", true);

		String senha = TerminalUtils.readLine("Informe a senha:", true);

		Locatario locatario = new Locatario(nome, login, senha);

		BancoDeDados.usuarios.add(locatario);
		
		TerminalUtils.clear();
		
		System.out.println("Proprietário cadastrado com sucesso");

	}

	public void alterarSenha() {
		
		System.out.println("Alteração de senha");
//		System.out.println("Por favor, preencha os dados de endereço");

		String nomeUsuario = TerminalUtils.readLine("Informe o nome de usuário:", true);
		
//		Se não existe usuário, retornar
		
		String senhaAtual = TerminalUtils.readLine("Informe a senha atual:", true);
		
//		Se senha estiver errada, retornar
		
		String novaSenha = TerminalUtils.readLine("Informe a nova senha:", true);
		
		String confirmacaoNovaSenha = TerminalUtils.readLine("Confirme a nova senha:", true);
		
		if(!confirmacaoNovaSenha.equals(novaSenha)){
//			Mensagem
		}
		
//		Senha alterada com sucesso

	}
	
	public void logout() {

		TerminalUtils.clear();
		
		BancoDeDados.usuarioLogado = null;

		System.out.println("Realizando logout...");

	}

	public void exit(){

		System.out.println("Sessão encerrada. Obrigado por usar o SysImob.");

		System.exit(0);

	}

}
