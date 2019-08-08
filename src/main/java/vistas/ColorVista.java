package vistas;

import tipo.Color;

public class ColorVista {
	
	public static final char[] INICIALES = {'r', 'v', 'a', 'y', 'p', 'n'};

	protected Color color;

	public ColorVista(Color color) {
		this.color = color;
	}

	static String getIniciales() {
		String resultado = "";
		for(char caracter: ColorVista.INICIALES) {
			resultado += caracter;
		}
		return resultado;
	}
	
	public char getInicial() {
		return ColorVista.INICIALES[this.color.ordinal()];
	}

	public static Color getInstance(char caracter) {
		for (int i = 0; i < ColorVista.INICIALES.length; i++) {
			if (ColorVista.INICIALES[i] == caracter) {
				return Color.values()[i];
			}
		}
		return null;
	}
}
