package vistas;

import controlador.Controlador;
import controlador.VisitadorControladores;

public abstract class Vista implements VisitadorControladores {
	
	public void interactuar(Controlador controlador) {
		controlador.accept(this);
	}
}
