package vistas.terminal;

import java.util.ArrayList;
import java.util.List;

import comun.TerminalVista;
import tipo.Color;
import controlador.PropuestaControlador;
import vistas.terminal.ColorVista;
import vistas.MensajeVista;

class CombinacionPropuestaVista extends TerminalVista {
	
	private PropuestaControlador propuesta;
	
	CombinacionPropuestaVista(PropuestaControlador propuesta) {
		this.propuesta = propuesta;
	}
	
	void escribir(int i) {
		for (Color color : propuesta.getColores(i)) {
			new ColorVista(color).escribir();
		}
	}
	
	List<Color> leer() {
		String caracteres = this.io.readString(MensajeVista.COMBINACION_PROPUESTA.getMensaje());
		List<Color> colores = new ArrayList<Color>();
		for (int i = 0; i < caracteres.length(); i++) {
			colores.add(ColorVista.getInstance(caracteres.charAt(i)));
		}
		return colores;
	}

}
