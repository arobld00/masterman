package controlador;

import modelo.Sesion;

public class RehacerControlador extends Controlador {
	
	RehacerControlador(Sesion sesion) {
		super(sesion);
	}
	
	void rehacer() {
		this.sesion.rehacer();
	}
	
	boolean rehacerable() {
		return this.sesion.rehacerable();
	}

}
