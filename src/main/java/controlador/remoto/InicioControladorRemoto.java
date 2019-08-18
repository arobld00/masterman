package controlador.remoto;

import controlador.InicioControlador;
import modelo.Sesion;

public class InicioControladorRemoto extends InicioControlador {
	
	private TCPIP conexion;

	public InicioControladorRemoto(Sesion sesion, TCPIP conexion) {
		super(sesion);
		this.conexion = conexion;
	}

	@Override
	public void comenzar() {
		this.conexion.escribir(Trama.COMENZAR.name());
	}

}
