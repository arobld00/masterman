package controlador.remoto;

import controlador.Logica;
import masterman.Masterman;
import vistas.Vista;
import vistas.terminal.TerminalVista;

public class TerminalRemoto extends Masterman {
	
	private LogicaRemota logica;

	@Override
	protected Logica crearLogica() {
		this.logica = new LogicaRemota();
		return this.logica;
	}

	@Override
	protected Vista crearVista() {
		return new TerminalVista();
	}
	
	@Override
	protected void jugar() {
		super.jugar();
		this.logica.desconectar();
	}
	
	public static void main(String[] args) {
		new TerminalRemoto().jugar();
	}

}
