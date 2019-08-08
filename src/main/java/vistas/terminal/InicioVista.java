package vistas.terminal;

import comun.TerminalVista;
import controlador.InicioControlador;
import vistas.MensajeVista;

class InicioVista extends TerminalVista {
	
	private CombinacionSecretaVista secreta;
	
	void interactuar(InicioControlador inicio) {
		inicio.comenzar();
		this.io.writeln(MensajeVista.TITULO.getMensaje());
		this.secreta = new CombinacionSecretaVista(inicio);
		this.secreta.escribir();
	}
	
	

}
