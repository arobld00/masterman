package vistas.terminal;

import comun.TerminalVista;
import controlador.JugarControlador;
import vistas.MensajeVista;

class ResultadoVista extends TerminalVista {

	private JugarControlador jugar;
	
	ResultadoVista(JugarControlador jugar) {
		this.jugar = jugar;
	}
	
	void escribir(int posicion) {
		this.io.writeln(MensajeVista.RESULTADO.getMensaje()
				.replaceFirst("#toros", "" + jugar.getToros(posicion))
				.replaceFirst("#vacas", "" + jugar.getVacas(posicion)));
	}
}
