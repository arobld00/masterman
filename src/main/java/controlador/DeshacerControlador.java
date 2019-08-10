package controlador;

import modelo.Sesion;

public class DeshacerControlador extends Controlador {
	
	DeshacerControlador(Sesion sesion) {
		super(sesion);
	}
	
	void deshacer() {
		this.sesion.deshacer();
	}
	
	boolean deshacerable() {
		return this.sesion.deshacerable();
	}

}
