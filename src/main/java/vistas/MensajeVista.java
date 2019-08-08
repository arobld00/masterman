package vistas;

public enum MensajeVista {
	INTENTOS("#intentos intento(s): "),
	SECRETO("*"),
	RESUMEN("¿Deseas continuar?"),
	RESULTADO(" >: #toros toros y #vacas vacas"),
	COMBINACION_PROPUESTA("Propón una combinación: "),
	TITULO("----- MASTERMAN -----"),
	GANADOR("Has ganado!!! ;-)"),
	PERDEDOR("Has perdido!!! :-(");

	private String mensaje;
	
	private MensajeVista(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getMensaje() {
		return this.mensaje;
	}
}
