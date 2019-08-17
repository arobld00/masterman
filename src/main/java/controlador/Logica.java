package controlador;

import java.util.HashMap;
import java.util.Map;

import modelo.Sesion;
import modelo.EstadoEnum;

public abstract class Logica {
	
	protected Sesion sesion;
	
	protected Map<EstadoEnum, AceptadorControlador> controladores;
	
	protected Logica() {
		this.controladores = new HashMap<EstadoEnum, AceptadorControlador>();
	}
	
	public AceptadorControlador getControlador() {
		return this.controladores.get(this.sesion.getEstado());
	}

}
