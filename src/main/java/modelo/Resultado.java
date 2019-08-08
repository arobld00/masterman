package modelo;

public class Resultado {
	
	private int toros = 0;
	
	private int vacas = 0;
	
	Resultado(int toros, int vacas) {
		assert toros >= 0;
		assert vacas >= 0;
		this.toros = toros;
		this.vacas = vacas;
	}
	
	boolean esGanador() {
		return this.toros == Combinacion.getAmplitud();
	}

	public int getToros() {
		return toros;
	}

	public int getVacas() {
		return vacas;
	}

}
