package controlador.remoto;

import controlador.ResumenControlador;
import modelo.Sesion;

public class ResumenControladorRemoto extends ResumenControlador {
	
	private TCPIP conexion;

	public ResumenControladorRemoto(Sesion sesion, TCPIP conexion) {
		super(sesion);
		this.conexion = conexion;
	}

	@Override
	public void reiniciar(boolean nueva) {
		this.conexion.escribir(Trama.NUEVA_PARTIDA.name());
		this.conexion.escribir(nueva);
	}

}
