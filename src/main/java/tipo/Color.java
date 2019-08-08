package tipo;

public enum Color {
	ROJO,
	VERDE,
	AZUL,
	YELLOW,
	P�RPURA,
	NARANJA;
	
	public static int length() {
		return Color.values().length;
	}
	
	public static Color conversor(String string) {
		assert string != null;
		for(Color color: Color.values()) {
			if (color.name().equals(string)) {
				return color;
			}
		}
		return null;
	}
}
