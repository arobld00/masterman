package masterman;

import controlador.AceptadorControlador;
import controlador.Logica;

import vistas.Vista;

public abstract class Masterman {
	
	private Logica logica;
	
	private Vista vista;
	
	protected Masterman() {
		this.logica = this.crearLogica();
		this.vista = this.crearVista();
	}
	
	protected abstract Logica crearLogica();
	
	protected abstract Vista crearVista();
	
	protected void jugar() {
		AceptadorControlador controlador;
		do {
			controlador = this.logica.getControlador();
			if (controlador != null) {
				this.vista.interactuar(controlador);
			}
		} while (controlador != null);
	}

}
