package controlador.remoto;

public enum Trama {
	COMENZAR,
	ESTADO,
	DESHACER,
	REHACER,
	DESHACERABLE,
	REHACERABLE,
	GANADOR,
	PERDEDOR,
	INTENTOS,
	COLORES,
	COMBINACION_PROPUESTA,
	AMPLITUD,
	NUEVA_PARTIDA,
	TOROS,
	VACAS,
	DESCONECTAR;
	
	public static Trama conversor(String string) {
		assert string != null;
		for(Trama trama : Trama.values()) {
			if (trama.name().equals(string)) {
				return trama;
			}
		}
		return null;
	}	

}
