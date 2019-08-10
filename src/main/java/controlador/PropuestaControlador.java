package controlador;

import java.util.List;

import modelo.Combinacion;
import modelo.Sesion;
import tipo.Error;
import tipo.Color;

public class PropuestaControlador extends Controlador {
	
	public PropuestaControlador(Sesion sesion) {
		super(sesion);
	}
	
	public Error agregarPropuesta(List<Color> colores) {
		Error error = null;
		if (colores.size() != Combinacion.getAmplitud()) {
			error = Error.LONGITUD_INCORRECTA;
		} else {
			for (int i = 0; i < colores.size(); i++) {
				if (colores.get(i) == null) {
					error = Error.CARACTERES_INCORRECTOS;
				} else {
					for (int j = i+1; j < colores.size(); j++) {
						if (colores.get(i) == colores.get(j)) {
							error = Error.DUPLICADO;
						}
					}
				}
			}
		}
		if (error == null) {
			this.sesion.agregarCombinacionPropuesta(colores);
			if (this.sesion.esGanador() || this.sesion.esPerdedor()) {
				this.sesion.siguiente();
			}
		}
		return error;
	}
	
	public boolean esGanador() {
		return this.sesion.esGanador();
	}
	
	public boolean esPerdedor() {
		return this.sesion.esPerdedor();
	}
	
	public int getIntentos() {
		return this.sesion.getIntentos();
	}
	
	public List<Color> getColores(int posicion) {
		return this.sesion.getColores(posicion);
	}
	
	public int getToros(int posicion) {
		return this.sesion.getToros(posicion);
	}
	
	public int getVacas(int posicion) {
		return this.sesion.getVacas(posicion);
	}
	
}
