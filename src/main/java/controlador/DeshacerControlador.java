package controlador;

import modelo.Sesion;
import modelo.SesionLocal;

public class DeshacerControlador extends Controlador {
	
	public DeshacerControlador(Sesion sesion) {
		super(sesion);
	}
	
	public void deshacer() {
		((SesionLocal) this.sesion).deshacer();
	}
	
	public boolean deshacerable() {
		return ((SesionLocal) this.sesion).deshacerable();
	}

}
