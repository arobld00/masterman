package vistas.terminal;

import comun.TerminalVista;
import controlador.PropuestaControlador;
import vistas.MensajeVista;

class IntentosVista extends TerminalVista {
	
	private PropuestaControlador propuesta;
	
	IntentosVista(PropuestaControlador propuesta) {
		this.propuesta = propuesta;
	}
	
	void escribir() {
		this.io.writeln(MensajeVista.INTENTOS.getMensaje()
				.replace("#intentos", "" + propuesta.getIntentos()));
	}
	
}
