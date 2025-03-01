package modelo;

import java.util.ArrayList;
import java.util.List;
import tipo.Color;

public class CombinacionPropuesta extends Combinacion {
	
	public CombinacionPropuesta(List<Color> colores) {
		this.colores = colores;
	}

	public boolean contiene(Color color, int posicion) {
		return this.colores.get(posicion) == color;
	}

	public boolean contiene(Color color) {
		for (int i = 0; i < this.colores.size(); i++) {
			if (this.colores.get(i) == color) {
				return true;
			}
		}
		return false;
	}
	
	CombinacionPropuesta copia() {
		List<Color> colores = new ArrayList<Color>();
		for (Color color : this.colores) {
			colores.add(color);
		}
		return new CombinacionPropuesta(colores);
	}

}
