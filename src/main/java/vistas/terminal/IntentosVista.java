package vistas.terminal;

import comun.TerminalVista;
import controlador.JugarControlador;
import vistas.MensajeVista;

class IntentosVista extends TerminalVista {
	
	private JugarControlador jugar;
	
	IntentosVista(JugarControlador jugar) {
		this.jugar = jugar;
	}
	
	void escribir() {
		this.io.writeln(MensajeVista.INTENTOS.getMensaje()
				.replace("#intentos", "" + jugar.getIntentos()));
	}
	
}
