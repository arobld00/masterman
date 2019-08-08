package modelo;

import java.util.ArrayList;
import java.util.List;

class Memento {
	
	private List<CombinacionPropuesta> propuestas;
	
	private List<Resultado> resultados;
	
	private int intentos;
	
	Memento(int intentos) {
		this.intentos = intentos;
		this.propuestas = new ArrayList<CombinacionPropuesta>();
		this.resultados = new ArrayList<Resultado>();
	}
	
	void set(CombinacionPropuesta propuesta, Resultado resultado) {
		this.propuestas.add(propuesta);
		this.resultados.add(resultado);
	}
	
	CombinacionPropuesta getCombinacionPropuesta(int posicion) {
		return this.propuestas.get(posicion);
	}
	
	Resultado getResultado(int posicion) {
		return this.resultados.get(posicion);
	}
	
	int getExtension() {
		return propuestas.size();
	}
	
	int getIntentos() {
		return this.intentos;
	}

}
