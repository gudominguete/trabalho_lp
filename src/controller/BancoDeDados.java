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

    public static void init() {
    	usuarios.add(imobiliaria);
	}
    
    public static Imobiliaria getImobiliaria() {
    	return imobiliaria;
    }

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
