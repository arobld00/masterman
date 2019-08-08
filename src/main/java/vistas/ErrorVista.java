package vistas;

import tipo.Error;

public class ErrorVista {
	
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
