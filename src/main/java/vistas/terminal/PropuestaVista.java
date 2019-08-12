package vistas.terminal;

import java.util.List;

import comun.TerminalVista;
import tipo.Color;
import tipo.Error;
import controlador.JugarControlador;
import vistas.terminal.ErrorVista;
import vistas.MensajeVista;

class PropuestaVista extends TerminalVista {
	
	void interactuar(JugarControlador jugar) {
		Error error;
		do {
			List<Color> colores = new CombinacionPropuestaVista(jugar).leer();
			error = jugar.agregarCombinacionPropuesta(colores);
			if (error != null) {
				new ErrorVista(error).escribir();
			}
		} while(error != null);
		this.io.writeln();
		new IntentosVista(jugar).escribir();
		new CombinacionSecretaVista(jugar).escribir();
		for(int i = 0; i < jugar.getIntentos(); i++) {
			new CombinacionPropuestaVista(jugar).escribir(i);
			new ResultadoVista(jugar).escribir(i);
		}
		if (jugar.esGanador()) {
			this.io.writeln(MensajeVista.GANADOR.getMensaje());
		} else if (jugar.esPerdedor()) {
			this.io.writeln(MensajeVista.PERDEDOR.getMensaje());
		}
	}

}
