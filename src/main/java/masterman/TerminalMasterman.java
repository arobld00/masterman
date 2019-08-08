package masterman;

import vistas.Vista;
import vistas.terminal.TerminalVista;

public class TerminalMasterman extends Masterman {

	@Override
	protected Vista crearVista() {
		return new TerminalVista();
	}
	
	public static void main(String[] args) {
		new TerminalMasterman().jugar();
	}
	
	

}
