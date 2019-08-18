package controlador.remoto;

import modelo.EstadoEnum;
import modelo.Sesion;

public class SesionRemota implements Sesion {
	
	private TCPIP conexion;

	public SesionRemota(TCPIP conexion) {
		this.conexion = conexion;
	}

	@Override
	public int getAmplitud() {
		this.conexion.escribir(Trama.AMPLITUD.name());
		return this.conexion.leerEntero();
	}

	@Override
	public EstadoEnum getEstado() {
		this.conexion.escribir(Trama.ESTADO.name());
		return EstadoEnum.values()[this.conexion.leerEntero()];
	}

}
