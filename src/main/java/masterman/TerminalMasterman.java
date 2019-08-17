package masterman;

import controlador.Logica;
import controlador.local.LogicaLocal;
import vistas.Vista;
import vistas.terminal.TerminalVista;

public class TerminalMasterman extends Masterman {

	@Override
	protected Vista crearVista() {
		return new TerminalVista();
	}
	
	@Override
	protected Logica crearLogica() {
		return new LogicaLocal();
	}
	
	public static void main(String[] args) {
		new TerminalMasterman().jugar();
	}
	
	

}
