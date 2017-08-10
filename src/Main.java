import controller.BancoDeDados;
import controller.ControlPanel;

public class Main {
	
	public static void main(String[] args) {
		BancoDeDados.init();
		new ControlPanel().print();
	}

}
