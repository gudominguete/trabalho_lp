package controller.navegacao;

import java.util.Scanner;

public final class TerminalUtils {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String readLine(String descricao, boolean obrigatorio) {

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
	
	public static void clear() {
		for (int i = 0; i < 50; ++i){
			System.out.println();
		}
	}

}
