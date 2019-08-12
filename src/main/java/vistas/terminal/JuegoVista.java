package vistas.terminal;

import comun.IO;
import controlador.JugarControlador;
import vistas.MensajeVista;

public class JuegoVista {
	
	JuegoVista(JugarControlador jugar) {
		new IO().writeln(MensajeVista.LINEA.getMensaje());
		new IntentosVista(jugar).escribir();
		new CombinacionSecretaVista(jugar).escribir();
		for (int i = 0; i < jugar.getIntentos(); i++) {
			new CombinacionPropuestaVista(jugar).escribir(i);
			new ResultadoVista(jugar).escribir(i);
		}
		if (jugar.esGanador()) {
			new IO().writeln(MensajeVista.GANADOR.getMensaje());
		} else if (jugar.esPerdedor()) {
			new IO().writeln(MensajeVista.PERDEDOR.getMensaje());
		}
	}

}
