package controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.navegacao.Acoes;
import controller.navegacao.Etapa;
import controller.navegacao.Opcao;
import controller.navegacao.TerminalUtils;
import enums.TipoUsuario;

public class ControlPanel {
	
	public static Etapa inicial = new Etapa(0, "Inicial");
//	public static Etapa login = new Etapa(1, "Login");
	public static Etapa imobiliaria = new Etapa(1, "Imobiliária");
	public static Etapa proprietario = new Etapa(2, "Proprietário");
	public static Etapa locatario = new Etapa(3, "Locatário");
	
	private List<Etapa> etapas = new ArrayList<Etapa>();
	
	Etapa etapaAtual;
	
	public ControlPanel() {
		
//		Etapa inicial = new Etapa(0, "Inicial");
//		Etapa login = new Etapa(1, "Login");
//		Etapa imobiliaria = new Etapa(2, "Imobiliária");
//		Etapa proprietario = new Etapa(3, "Proprietário");
//		Etapa locatario = new Etapa(4, "Locatário");

		//Opcoes login
		Opcao optLogin = new Opcao("Login", "login", inicial);
		Opcao optCadProprietario = new Opcao("Cadastrar proprietario", "cadastrarProprietario", inicial);
		Opcao optCadLocatario = new Opcao("Cadastrar locatario", "cadastrarLocatario", inicial);
		Opcao optAlterarSenha = new Opcao("Alterar senha", "alterarSenha", inicial);
		Opcao optSair = new Opcao("Sair", "exit", inicial);
		Opcao optImprimirBanco = new Opcao("Imprimir banco", "imprimirBanco", inicial);
		
		Opcao optLogout = new Opcao("Voltar para tela inicial", "logout", inicial);

//		Opcoes da imobiliaria
		Opcao optListarImoveisImobiliaria = new Opcao("Listar imóveis", "listarImoveisImobiliaria", imobiliaria);
		Opcao optGerarCobranca = new Opcao("Gerar cobrança", "gerarCobranca", imobiliaria);

//		Opcoes do proprietario
		Opcao optCadImovel = new Opcao("Cadastrar imóvel", "cadastrarImovel", proprietario);
		Opcao optRemoverImovel = new Opcao("Remover imóvel", "removerImovel", proprietario);
		
//		Opcoes do locatario
		Opcao optAlugarImovel = new Opcao("Alugar imóvel", "alugarImovel", proprietario);
		Opcao optPagarCobranca = new Opcao("Pagar cobrança", "pagarCobranca", proprietario);

		List<Opcao> listaOpcoesInicial = new ArrayList<>();
		listaOpcoesInicial.add(optLogin);
		listaOpcoesInicial.add(optCadProprietario);
		listaOpcoesInicial.add(optCadLocatario);
		listaOpcoesInicial.add(optAlterarSenha);
		listaOpcoesInicial.add(optSair);
		listaOpcoesInicial.add(optImprimirBanco);

		inicial.setOpcoes(listaOpcoesInicial);

//		List<Opcao> listaOpcoesLogin = new ArrayList<>();
//		listaOpcoesLogin.add(optLogout);
//		login.setOpcoes(listaOpcoesLogin);
		
		List<Opcao> listaOpcoesImobiliaria = new ArrayList<>();
		listaOpcoesImobiliaria.add(optListarImoveisImobiliaria);
		listaOpcoesImobiliaria.add(optGerarCobranca);
		listaOpcoesImobiliaria.add(optLogout);
		imobiliaria.setOpcoes(listaOpcoesImobiliaria);
		
		List<Opcao> listaOpcoesProprietario = new ArrayList<>();
		listaOpcoesProprietario.add(optCadImovel);
		listaOpcoesProprietario.add(optRemoverImovel);
		listaOpcoesProprietario.add(optLogout);
		proprietario.setOpcoes(listaOpcoesProprietario);
		
		List<Opcao> listaOpcoesLocatario = new ArrayList<>();
		listaOpcoesLocatario.add(optAlugarImovel);
		listaOpcoesLocatario.add(optPagarCobranca);
		listaOpcoesLocatario.add(optLogout);
		locatario.setOpcoes(listaOpcoesLocatario);
		
		etapas.add(inicial);
//		etapas.add(login);
		etapas.add(imobiliaria);
		etapas.add(proprietario);
		etapas.add(locatario);
		
		etapaAtual = inicial;
		
	}
	
	public void print() {
		
		System.out.println("+-+-+-+-+-+-+-+ +-+-+ +-+-+-+-+-+-+");
		System.out.println("|S|i|s|t|e|m|a| |d|e| |g|e|s|t|a|o|");
		System.out.println("+-+-+-+-+-+-+-+ +-+-+ +-+-+-+-+-+-+");

		System.out.println("\r\n  ___                 _     _ _ _            _             \r\n" +
							" |_ _|_ __ ___   ___ | |__ (_) (_) __ _ _ __(_) __ _       \r\n" +
							"  | || '_ ` _ \\ / _ \\| '_ \\| | | |/ _` | '__| |/ _` |      \r\n" +
							"  | || | | | | | (_) | |_) | | | | (_| | |  | | (_| |      \r\n" +
							" |___|_| |_| |_|\\___/|_.__/|_|_|_|\\__,_|_|  |_|\\__,_|      \r\n" +
							"  _                                _           _           \r\n" +
							" | |__   ___   __ _ ___     __   _(_)_ __   __| | __ _ ___ \r\n" +
							" | '_ \\ / _ \\ / _` / __|____\\ \\ / / | '_ \\ / _` |/ _` / __|\r\n" +
							" | |_) | (_) | (_| \\__ \\_____\\ V /| | | | | (_| | (_| \\__ \\\r\n" +
							" |_.__/ \\___/ \\__,_|___/      \\_/ |_|_| |_|\\__,_|\\__,_|___/\r\n" +
							"                                                           \r\n");

		exibirEtapa();
		
	}
	
	private void exibirEtapa() {

		System.out.println("=====================================");
		System.out.println("Você está em: " + etapaAtual.getNome());
		System.out.println("Escolha a opção desejada:");
		
		int indiceOpcao = 0;
		for (Opcao opcao : etapaAtual.getOpcoes()) {

			System.out.println((++indiceOpcao) + " - " + opcao.getNome());

		}
		
		int indiceEscolhido = Integer.parseInt(TerminalUtils.readLine("Número da opção: ", true));
		
		Opcao opcaoEscolhida = etapaAtual.getOpcoes().get(indiceEscolhido - 1);
		
		processarOpcao(opcaoEscolhida);
		
		etapaAtual = opcaoEscolhida.getProximaEtapa();
		
		exibirEtapa();

	}
	
	private void processarOpcao(Opcao opcao) {

		try {
			Method method = Acoes.class.getMethod(opcao.getAcao());
			method.invoke(Acoes.getInstance());
			
			if(opcao.getAcao().equals("login")){
				opcao.setProximaEtapa(getEtapaParaUsuarioLogado());
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}

	}
	
	private Etapa getEtapaParaUsuarioLogado() {
		
		if(BancoDeDados.usuarioLogado == null){
			return inicial;
		}

		if(BancoDeDados.usuarioLogado.getTipo().equals(TipoUsuario.PROPRIETARIO)){
			return proprietario;
		}else if(BancoDeDados.usuarioLogado.getTipo().equals(TipoUsuario.LOCATARIO)){
			return locatario;
		}else if(BancoDeDados.usuarioLogado.getTipo().equals(TipoUsuario.IMOBILIARIA)){
			return imobiliaria;
		}
		
		return inicial;
		
	}

}
