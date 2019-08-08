package modelo;

import java.util.Collections;
import java.util.Random;
import tipo.Color;

class CombinacionSecreta extends Combinacion {
	
	CombinacionSecreta() {
		for (Color color : Color.values()) {
			this.colores.add(color);
		}
		Random r = new Random(System.currentTimeMillis());
		for (int i = 0; i < Color.length() - Combinacion.getAmplitud(); i++) {
			this.colores.remove(r.nextInt(this.colores.size()));
		}
		Collections.shuffle(this.colores);
	}
	
	Resultado getResultado(CombinacionPropuesta propuesta) {
		int toros = 0;
		for (int i = 0; i < this.colores.size(); i++) {
			if (propuesta.contiene(this.colores.get(i), i)) {
				toros++;
			}
		}
		int vacas = 0;
		for (Color color : this.colores) {
			if (propuesta.contiene(color)) {
				vacas++;
			}	
		}
		return new Resultado(toros, vacas - toros);
	}

}
