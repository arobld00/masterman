package vistas.terminal;

import comun.TerminalVista;
import controlador.PropuestaControlador;
import vistas.MensajeVista;

class ResultadoVista extends TerminalVista {

	private PropuestaControlador propuesta;
	
	ResultadoVista(PropuestaControlador propuesta) {
		this.propuesta = propuesta;
	}
	
	void escribir(int posicion) {
		this.io.writeln(MensajeVista.RESULTADO.getMensaje()
				.replaceFirst("#toros", "" + propuesta.getToros(posicion))
				.replaceFirst("#vacas", "" + propuesta.getVacas(posicion)));
	}
}
