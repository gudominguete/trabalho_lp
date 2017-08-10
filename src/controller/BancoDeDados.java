package controller;

import java.util.ArrayList;
import java.util.List;

import models.Imobiliaria;
import models.Usuario;

/**
 * Created by gudominguete on 08/08/17.
 */
public abstract class BancoDeDados {
	
	private static Imobiliaria imobiliaria = new Imobiliaria("Imobiliária Boas-Vindas", "boasvindas", "123");
	
    public static List<Usuario> usuarios = new ArrayList<>();
    
    public static Usuario usuarioLogado;
    
    public static void init() {
    	usuarios.add(imobiliaria);
	}
    
    public static Imobiliaria getImobiliaria() {
    	return imobiliaria;
    }

}
