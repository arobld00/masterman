package modelo;

import java.util.ArrayList;
import java.util.List;

import tipo.Color;

public class Juego {
	
	private static final int MAX_INTENTOS = 10;
	
	private int intentos;
	
	private List<Resultado> resultados;
	
	private CombinacionSecreta secreta;
	
	private List<CombinacionPropuesta> propuestas;
	
	public Juego() {
		this.reiniciar();
	}

	public void reiniciar() {
		this.secreta = new CombinacionSecreta();
		this.propuestas = new ArrayList<CombinacionPropuesta>();
		this.resultados = new ArrayList<Resultado>();
		this.intentos = 0;
	}
	
	public void agregarCombinacionPropuesta(List<Color> colores) {
		CombinacionPropuesta propuesta = new CombinacionPropuesta(colores);
		this.propuestas.add(propuesta);
		this.resultados.add(this.secreta.getResultado(propuesta));
		this.intentos++;
	}
	
	public int getAmplitud() {
		return Combinacion.getAmplitud();
	}
	
	public Memento crearMemento() {
		Memento copia = new Memento(this.intentos);
		for (int i = 0; i < this.propuestas.size(); i++) {
			copia.set(this.propuestas.get(i).copia(), this.resultados.get(i).copia());
		}
		return copia;
	}
	
	public void set(Memento memento) {
		this.intentos = memento.getIntentos();
		this.propuestas = new ArrayList<CombinacionPropuesta>();
		this.resultados = new ArrayList<Resultado>();
		for (int i = 0; i < memento.getExtension(); i++) {
			this.propuestas.add(memento.getCombinacionPropuesta(i).copia());
			this.resultados.add(memento.getResultado(i).copia());
		}
	}
	
	public boolean esPerdedor() {
		return this.intentos == Juego.MAX_INTENTOS;
	}
	
	public boolean esGanador() {
		return this.resultados.get(this.intentos-1).esGanador();
	}
	
	public int getIntentos() {
		return this.intentos;
	}
	
	public CombinacionPropuesta getCombinacionPropuesta(int posicion) {
		return this.propuestas.get(posicion);
	}
	
	public List<Color> getColores(int posicion) {
		return this.propuestas.get(posicion).colores;
	}
	
	public int getToros(int posicion) {
		return this.resultados.get(posicion).getToros();
	}
	
	public int getVacas(int posicion) {
		return this.resultados.get(posicion).getVacas();
	}

}
