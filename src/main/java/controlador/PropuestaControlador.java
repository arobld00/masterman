package controlador;

import java.util.List;

import modelo.Combinacion;
import modelo.Estado;
import modelo.Juego;
import tipo.Error;
import tipo.Color;

public class PropuestaControlador extends Controlador {
	
	public PropuestaControlador(Juego juego, Estado estado) {
		super(juego, estado);
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
			this.juego.agregarCombinacionPropuesta(colores);
			if (this.juego.esGanador() || this.juego.esPerdedor()) {
				this.estado.siguiente();
			}
		}
		return error;
	}
	
	public boolean esGanador() {
		return this.juego.esGanador();
	}
	
	public boolean esPerdedor() {
		return this.juego.esPerdedor();
	}
	
	public int getIntentos() {
		return this.juego.getIntentos();
	}
	
	public List<Color> getColores(int posicion) {
		return this.juego.getColores(posicion);
	}
	
	public int getToros(int posicion) {
		return this.juego.getToros(posicion);
	}
	
	public int getVacas(int posicion) {
		return this.juego.getVacas(posicion);
	}
	
	@Override
	public void accept(VisitadorControladores visitador) {
		visitador.visit(this);
	}
}
