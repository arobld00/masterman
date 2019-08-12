package vistas;

import comun.TerminalVista;
import tipo.Error;

public class ErrorVista extends TerminalVista {
	
	public static final String[] MENSAJES = { 
			"Colores repetidos",
			"Color incorrecto, debe ser: " + ColorVista.getIniciales(), 
			"Error en la longitud de la combinación propuesta" };

	protected Error error;

	public ErrorVista(Error error) {
		this.error = error;
	}
	
	public String getMensaje() {
		return ErrorVista.MENSAJES[this.error.ordinal()];
	}
	
}
