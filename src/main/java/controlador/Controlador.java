package controlador;

import modelo.EstadoEnum;
import modelo.Sesion;

public abstract class Controlador {
	
	protected Sesion sesion;
	
	Controlador(Sesion sesion) {
		this.sesion = sesion;
	}
	
	public int getAmplitud() {
		return this.sesion.getAmplitud();
	}
	
	public EstadoEnum getEstado() {
		return this.sesion.getEstado();
	}

}
