package vistas.terminal;

import tipo.Color;
import comun.IO;

class ColorVista extends vistas.ColorVista {
	
	ColorVista(Color color) {
		super(color);
	}
	
	void escribir() {
		new IO().write(ColorVista.INICIALES[this.color.ordinal()]);
	}

}
