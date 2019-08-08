package modelo;

import java.util.ArrayList;
import java.util.List;
import tipo.Color;

public abstract class Combinacion {
	
	private static final int AMPLITUD = 4;
	
	protected List<Color> colores;
	
	protected Combinacion() {
		this.colores = new ArrayList<Color>();
	}
	
	public static int getAmplitud() {
		return Combinacion.AMPLITUD;
	}
	
	public Color[] getColores() {
		Color[] colores = new Color[this.colores.size()];
		return this.colores.toArray(colores);
	}

}
