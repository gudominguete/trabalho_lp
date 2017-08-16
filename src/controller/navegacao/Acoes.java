package controller.navegacao;

import java.util.List;
import java.util.Scanner;

import models.*;
import controller.BancoDeDados;
import models.pagavel.Aluguel;

public class Acoes {
	
	private static Acoes INSTANCIA = new Acoes();
	
	private Acoes() {}
	
	public static Acoes getInstance() {
		return INSTANCIA;
	}

	private Proprietario proprietario = new Proprietario("", "", "");

	/**
	 * Listar os imoveis da imobiliaria
	 */
	public void listarImoveisImobiliaria(){

		Imobiliaria imobiliaria = BancoDeDados.getImobiliaria();

		for(Imovel imovel:imobiliaria.getImoveis()){
			System.out.println(imovel);
		}
	}

	/**
	 * Listar os imoveis do proprietario
	 * @return
	 */
	public List<Imovel> listarImoveisProprietario() {
		return proprietario.getListaImoveis();
	}

	/**
	 * Cadastrar um imovel no banco de dados da imobiliaria
	 * @return
	 */
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

		Double valor = Double.parseDouble(TerminalUtils.readLine("Imorme o valor:", true));
		
		Endereco endereco = new Endereco(rua, numero, complemento, bairro, municipio, uf);
		
		novoImovel.setEndereco(endereco);

		novoImovel.setId(BancoDeDados.getImobiliaria().getImoveis().size());

		novoImovel.setValor(valor);
		// inserir na lista do proprietario
		
		BancoDeDados.getImobiliaria().inserirImovel(novoImovel);
		
		return novoImovel;

	}

	/**
	 * Gera as cobranças em relação aos contratos no banco de dados
	 */
	public void gerarCobranca() {

		for(Contrato contrato:BancoDeDados.contratos){
			Aluguel aluguel = new Aluguel(contrato, contrato.getImovel().getValor());
			BancoDeDados.alugueis.add(aluguel);
		}
	}

	/**
	 * pagar cobrança do usuário
	 */
	public void pagarCobranca() {

		for(Aluguel aluguel:BancoDeDados.alugueis){
			if(aluguel.getContrato().getLocatario().getLogin().equals(BancoDeDados.usuarioLogado.getLogin())){
				aluguel.pagar();
				return ;
			}
		}
	}

	/**
	 * Aluguar um imovel
	 */
	public void alugarImovel() {


		System.out.println("alugarImovel");

		Imobiliaria imobiliaria = BancoDeDados.getImobiliaria();

		for(Imovel imovel:imobiliaria.getImoveis()){
			System.out.println(imovel);
		}

		Integer opcao = Integer.parseInt(TerminalUtils.readLine("Informe o imovel desejado:", true));

		Imovel imovel = imobiliaria.getImoveis().get(opcao);

		Contrato contrato = new Contrato(imovel, (Locatario) BancoDeDados.usuarioLogado);

		BancoDeDados.contratos.add(contrato);

	}

	/**
	 * Realiza a autenticação no sistema
	 */
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

	/**
	 * Cadastrar um novo usuário do tipo proprietário
	 */
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

	/**
	 * Cadastrar um novo usuário do tipo locatario
	 */
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

	/**
	 * Alterar a senha do usuário
	 */
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

	/**
	 * Sair da conta do usuário
	 */
	public void logout() {

		TerminalUtils.clear();
		
		BancoDeDados.usuarioLogado = null;

		System.out.println("Realizando logout...");

	}

	/**
	 * Sair do sistema
	 */
	public void exit(){

		System.out.println("Sessão encerrada. Obrigado por usar o SysImob.");

		System.exit(0);

	}

	/**
	 * Imprimir dados do banco
	 */
	public void imprimirBanco(){
		BancoDeDados.imprimirBanco();
	}

}
