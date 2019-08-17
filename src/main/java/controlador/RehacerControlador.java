package controlador;

import modelo.Sesion;
import modelo.SesionLocal;

public class RehacerControlador extends Controlador {
	
	public RehacerControlador(Sesion sesion) {
		super(sesion);
	}
	
	public void rehacer() {
		((SesionLocal) this.sesion).rehacer();
	}
	
	public boolean rehacerable() {
		return ((SesionLocal) this.sesion).rehacerable();
	}

}
