import java.util.List;

import models.Usuario;
import controller.ControlPanel;

public class Main {
	
	List<Usuario> usuarios;

	public static void main(String[] args) {
		
		new ControlPanel().print();

	}

}