package modelo;

import java.util.List;

import tipo.Color;

public class Sesion {
	
	private Estado estado;
	
	private Juego juego;
	
	private Registro registro;
	
	public Sesion() {
		this.estado = new Estado();
		this.juego = new Juego();
		this.registro = new Registro(this.juego);
	}
	
	public void siguiente() {
		this.estado.siguiente();
	}
	
	public void agregarCombinacionPropuesta(List<Color> colores) {
		this.juego.agregarCombinacionPropuesta(colores);
		this.registro.registrar();
	}
	
	public boolean deshacerable() {
		return this.registro.deshacer();
	}
	
	public boolean rehacerable() {
		return this.registro.rehacer();
	}
	
	public void deshacer() {
		this.registro.deshacer(this.juego);
	}
	
	public void rehacer() {
		this.registro.rehacer(this.juego);
	}
	
	public void reinciar() {
		this.juego.reiniciar();
		this.estado.reiniciar();
		this.registro.reiniciar();
	}
	
	public boolean esGanador() {
		return this.juego.esGanador();
	}
	
	public boolean esPerdedor() {
		return this.juego.esPerdedor();
	}
	
	public int getAmplitud() {
		return this.juego.getAmplitud();
	}
	
	public int getIntentos() {
		return this.juego.getIntentos();
	}
	
	public List<Color> getColores(int posicion) {
		return this.juego.getColores(posicion);
	}
	
	public int getVacas(int posicion) {
		return this.juego.getVacas(posicion);
	}
	
	public int getToros(int posicion) {
		return this.juego.getToros(posicion);
	}
	
	public EstadoEnum getEstado() {
		return this.estado.getEstado();
	}

}
