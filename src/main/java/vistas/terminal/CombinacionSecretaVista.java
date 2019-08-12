package vistas.terminal;

import vistas.MensajeVista;
import comun.TerminalVista;
import controlador.Controlador;

class CombinacionSecretaVista extends TerminalVista {
	
	private Controlador controlador;
	
	CombinacionSecretaVista(Controlador controlador) {
		super();
		this.controlador= controlador;
	}
	
	void escribir() {
		for (int i = 0; i < this.controlador.getAmplitud(); i++) {
			this.io.write(MensajeVista.SECRETO.getMensaje());
		}
		this.io.writeln();
	}

}
