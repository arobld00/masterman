package controlador.remoto.operadores;

import java.util.HashMap;
import java.util.Map;

import controlador.remoto.TCPIP;
import controlador.remoto.Trama;

public class OperadorPrototype {
	
	private TCPIP conexion;
	
	private Map<Trama, Operador> operadores;
	
	public OperadorPrototype(TCPIP conexion) {
		this.conexion = conexion;
		this.operadores = new HashMap<Trama, Operador>();
	}
	
	public void ejecutar(Trama trama) {
		this.operadores.get(trama).ejecutar();
	}
	
	public void agregar(Trama trama, Operador operador) {
		this.operadores.put(trama, operador);
		operador.asociar(conexion);
	}

}
