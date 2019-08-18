package controlador.remoto.operadores;

import controlador.AceptadorControlador;
import controlador.remoto.TCPIP;

public abstract class Operador {
	
	protected AceptadorControlador controlador;
	
	protected TCPIP conexion;
	
	public Operador(AceptadorControlador controlador) {
		this.controlador = controlador;
	}
	
	public abstract void ejecutar();
	
	public void asociar(TCPIP conexion) {
		this.conexion = conexion;
	}

}
