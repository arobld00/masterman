package masterman;

import controlador.AceptadorControlador;
import controlador.Logica;

import vistas.Vista;

public abstract class Masterman {
	
	private Logica logica;
	
	private Vista vista;
	
	protected Masterman() {
		this.logica = new Logica();
		this.vista = this.crearVista();
	}
	
	protected abstract Vista crearVista();
	
	protected void jugar() {
		AceptadorControlador controlador;
		do {
			controlador = this.logica.getControlador();
			this.vista.interactuar(controlador);
		} while (controlador != null);
	}

}
