package controlador;

import java.util.HashMap;
import java.util.Map;

import modelo.Estado;
import modelo.Juego;
import modelo.EstadoEnum;

public class Logica {
	
	private Estado estado;
	
	private Juego juego;
	
	private Map<EstadoEnum, Controlador> controladores;
	
	public Logica() {
		this.estado = new Estado();
		this.juego = new Juego();
		this.controladores = new HashMap<EstadoEnum, Controlador>();
		this.controladores.put(EstadoEnum.INICIO, new InicioControlador(this.juego, this.estado));
		this.controladores.put(EstadoEnum.EN_PARTIDA, new PropuestaControlador(this.juego, this.estado));
		this.controladores.put(EstadoEnum.FIN, new ResumenControlador(this.juego, this.estado));
		this.controladores.put(EstadoEnum.SALIR, null);
	}
	
	public Controlador getControlador() {
		return this.controladores.get(this.estado.getEstado());
	}

}
