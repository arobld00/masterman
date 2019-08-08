package comun;

public class PreguntaVista extends TerminalVista {
	
	private static final char AFIRMATIVO = 'y';

	private static final char NEGATIVO = 'n';
	
	private static final String PREGUNTA = "? (" + PreguntaVista.AFIRMATIVO + "/" + PreguntaVista.NEGATIVO + "): ";

	private static final String MENSAJE = "El valor debe ser '" + PreguntaVista.AFIRMATIVO + "' o '"
			+ PreguntaVista.NEGATIVO + "'";

	public boolean leer(String titulo) {
		assert titulo != null;
		char respuesta;
		boolean ok;
		do {
			respuesta = this.io.readChar(titulo + PreguntaVista.PREGUNTA);
			ok = PreguntaVista.afirmativo(respuesta) || PreguntaVista.negativo(respuesta);
			if (!ok) {
				this.io.write(PreguntaVista.NEGATIVO);
			}
		} while (!ok);
		return PreguntaVista.afirmativo(respuesta);
	}

	private static boolean afirmativo(char respuesta) {
		return Character.toLowerCase(respuesta) == PreguntaVista.AFIRMATIVO;
	}

	private static boolean negativo(char respuesta) {
		return Character.toLowerCase(respuesta) == PreguntaVista.NEGATIVO;
	}

}
