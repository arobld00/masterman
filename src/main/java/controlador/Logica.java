package controlador;

import java.util.HashMap;
import java.util.Map;

import modelo.Sesion;
import modelo.EstadoEnum;

public class Logica {
	
	private Sesion sesion;
	
	private Map<EstadoEnum, AceptadorControlador> controladores;
	
	public Logica() {
		this.sesion = new Sesion();
		this.controladores = new HashMap<EstadoEnum, AceptadorControlador>();
		this.controladores.put(EstadoEnum.INICIO, new InicioControlador(this.sesion));
		this.controladores.put(EstadoEnum.EN_PARTIDA, new JugarControlador(this.sesion));
		this.controladores.put(EstadoEnum.FIN, new ResumenControlador(this.sesion));
		this.controladores.put(EstadoEnum.SALIR, null);
	}
	
	public AceptadorControlador getControlador() {
		return this.controladores.get(this.sesion.getEstado());
	}

}
