package controlador;

import modelo.Sesion;

public abstract class AceptadorControlador extends Controlador {
	
	AceptadorControlador(Sesion sesion) {
		super(sesion);
	}
	
	public abstract void accept(VisitadorControladores visitador);

}
