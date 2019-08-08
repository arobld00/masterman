package vistas.terminal;

import comun.PreguntaVista;
import controlador.ResumenControlador;
import vistas.MensajeVista;

class ResumenVista {
	
	void interactuar(ResumenControlador resumen) {
		boolean nueva = new PreguntaVista().leer(MensajeVista.RESUMEN.getMensaje());
		resumen.reiniciar(nueva);
	}

}
