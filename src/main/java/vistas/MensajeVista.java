package vistas;

public enum MensajeVista {
	INTENTOS("#intentos intento(s): "),
	SECRETO("*"),
	RESUMEN("�Deseas continuar?"),
	RESULTADO(" >: #toros toros y #vacas vacas"),
	COMBINACION_PROPUESTA("Prop�n una combinaci�n: "),
	TITULO("----- MASTERMAN -----"),
	GANADOR("Has ganado!!! ;-)"),
	PERDEDOR("Has perdido!!! :-("),
	LINEA(""),
	PROPONER_COMANDO("Proponer combinaci�n"),
	DESHACER_COMANDO("Deshacer combinaci�n anterior"),
	REHACER_COMANDO("Rehacer combinaci�n anterior");

	private String mensaje;
	
	private MensajeVista(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getMensaje() {
		return this.mensaje;
	}
}
