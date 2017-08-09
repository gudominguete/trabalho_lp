package controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.navegacao.Acoes;
import controller.navegacao.Etapa;
import controller.navegacao.Opcao;
import models.Imobiliaria;
import models.Usuario;

public class ControlPanel {
	
	private Imobiliaria imobiliaria;
	private List<Usuario> usuarios;
	
	private List<Etapa> etapas = new ArrayList<Etapa>();
	
	Etapa etapaAtual;
	
	public ControlPanel() {
		
		Etapa inicial = new Etapa(0, "Inicial");
		Etapa login = new Etapa(1, "Login");
		Etapa imobiliaria = new Etapa(2, "Imobiliária");
		Etapa proprietario = new Etapa(3, "Proprietário");
		Etapa locatario = new Etapa(4, "Locatário");

		//Opcoes login
		Opcao optLogin = new Opcao(0, "Login", "login", login);
		Opcao optCadImobiliaria = new Opcao(1, "Cadastrar imobiliaria", "cadastrarImobiliaria", inicial);
		Opcao optCadProprietario = new Opcao(2, "Cadastrar proprietario", "cadastrarProprietario", inicial);
		Opcao optCadLocatario = new Opcao(3, "Cadastrar locatario", "cadastrarLocatario", inicial);
		Opcao optAlterarSenha = new Opcao(4, "Alterar senha", "alterarSenha", inicial);
		Opcao optLogout = new Opcao(5, "Sair", "exit", inicial);

		Opcao optListarImoveisImobiliaria = new Opcao(3, "Listar imóveis", "listarImoveisImobiliaria", imobiliaria);
		Opcao optAlugarImovel = new Opcao(4, "Alugar imovel", "alugarImovel", imobiliaria);
		Opcao optGerarCobranca = new Opcao(5, "Gerar cobrança", "gerarCobranca", imobiliaria);
		Opcao optRemoverImovel = new Opcao(6, "Remover imóvel", "removerImovel", imobiliaria);


		List<Opcao> listaOpcoesInicial = new ArrayList<>();
		listaOpcoesInicial.add(optLogin);
		listaOpcoesInicial.add(optCadImobiliaria);
		listaOpcoesInicial.add(optCadProprietario);
		listaOpcoesInicial.add(optCadLocatario);
		listaOpcoesInicial.add(optAlterarSenha);
		listaOpcoesInicial.add(optLogout);

		inicial.setOpcoes(listaOpcoesInicial);

		List<Opcao> listaOpcoesLogin = new ArrayList<>();
		listaOpcoesLogin.add(optLogout);
		login.setOpcoes(listaOpcoesLogin);
		
		etapas.add(inicial);
		etapas.add(login);
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

		exibirEtapa(etapaAtual);
		
	}
	
	private void exibirEtapa(Etapa etapa) {

		System.out.println(etapa.getNome());
		System.out.println("Escolha a opção desejada:");
		
		for (Opcao opcao : etapa.getOpcoes()) {

			System.out.println((opcao.getId() + 1) + " - " + opcao.getNome());
			
		}
		
		System.out.println("Número da opção: ");
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
//		sc.close();
		
		Opcao opcaoEscolhida = etapa.getOpcoes().get(opt - 1);
		
		processarOpcao(opcaoEscolhida);
		
		exibirEtapa(opcaoEscolhida.getProximaEtapa());

	}
	
	private void processarOpcao(Opcao opcao) {

		try {
			Method method = Acoes.class.getMethod(opcao.getAcao());
			method.invoke(Acoes.getInstance());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
