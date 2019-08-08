package controlador;

import modelo.Combinacion;
import modelo.Estado;
import modelo.Juego;

public abstract class Controlador {
	
	protected Juego juego;
	
	protected Estado estado;
	
	Controlador(Juego juego, Estado estado) {
		this.juego = juego;
		this.estado = estado;
	}
	
	public int getAmplitud() {
		return Combinacion.getAmplitud();
	}
	
	public abstract void accept(VisitadorControladores visitador);

}
