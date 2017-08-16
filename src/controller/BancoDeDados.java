package controller;

import java.util.ArrayList;
import java.util.List;

import models.Contrato;
import models.Imobiliaria;
import models.Usuario;
import models.pagavel.Aluguel;

/**
 * Created by gudominguete on 08/08/17.
 */
public abstract class BancoDeDados {
	
	private static Imobiliaria imobiliaria = new Imobiliaria("Imobiliária Boas-Vindas", "boasvindas", "123");
	
    public static List<Usuario> usuarios = new ArrayList<>();
    
    public static Usuario usuarioLogado;

    public static List<Contrato> contratos = new ArrayList<>();

    public static List<Aluguel> alugueis = new ArrayList<>();

    /**
     * Método para iniciar o banco de dados
     */
    public static void init() {
    	usuarios.add(imobiliaria);
	}

    /**
     * Método para buscar a imobiliaria dona do sistema
     * @return
     */
    public static Imobiliaria getImobiliaria() {
    	return imobiliaria;
    }

    /**
     * Método para imprimir os elementos do banco
     */
    public static void imprimirBanco(){

        System.out.println("Imobiliaria");
        System.out.println(imobiliaria);

        System.out.println("Usuarios");
        for(Usuario usuario : usuarios){
            System.out.println(usuario);
        }

        System.out.println("Contratos");
        for(Contrato contrato: contratos){
            System.out.println(contrato);
        }

        System.out.println("Alugueis");
        for(Aluguel aluguel:alugueis){
            System.out.println(aluguel);
        }
    }
}
