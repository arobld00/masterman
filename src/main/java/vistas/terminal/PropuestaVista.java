package vistas.terminal;

import java.util.List;

import comun.TerminalVista;
import tipo.Color;
import tipo.Error;
import controlador.PropuestaControlador;
import vistas.terminal.ErrorVista;
import vistas.MensajeVista;

class PropuestaVista extends TerminalVista {
	
	void interactuar(PropuestaControlador propuesta) {
		Error error;
		do {
			List<Color> colores = new CombinacionPropuestaVista(propuesta).leer();
			error = propuesta.agregarPropuesta(colores);
			if (error != null) {
				new ErrorVista(error).escribir();
			}
		} while(error != null);
		this.io.writeln();
		new IntentosVista(propuesta).escribir();
		new CombinacionSecretaVista(propuesta).escribir();
		for(int i = 0; i < propuesta.getIntentos(); i++) {
			new CombinacionPropuestaVista(propuesta).escribir(i);
			new ResultadoVista(propuesta).escribir(i);
		}
		if (propuesta.esGanador()) {
			this.io.writeln(MensajeVista.GANADOR.getMensaje());
		} else if (propuesta.esPerdedor()) {
			this.io.writeln(MensajeVista.PERDEDOR.getMensaje());
		}
	}

}
