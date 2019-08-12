package vistas;

import controlador.AceptadorControlador;
import controlador.VisitadorControladores;

public abstract class Vista implements VisitadorControladores {
	
	public void interactuar(AceptadorControlador controlador) {
		controlador.accept(this);
	}
}
