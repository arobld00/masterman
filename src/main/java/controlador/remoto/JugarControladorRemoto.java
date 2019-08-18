package controlador.remoto;

import java.util.ArrayList;
import java.util.List;

import controlador.JugarControlador;
import modelo.Sesion;
import tipo.Color;
import tipo.Error;

public class JugarControladorRemoto extends JugarControlador {
	
	private TCPIP conexion;

	public JugarControladorRemoto(Sesion sesion, TCPIP conexion) {
		super(sesion);
		this.conexion = conexion;
	}

	@Override
	public Error agregarCombinacionPropuesta(List<Color> colores) {
		this.conexion.escribir(Trama.COMBINACION_PROPUESTA.name());
		this.conexion.escribir(colores.size());
		for (Color color : colores) {
			this.conexion.escribir(color);
		}
		return this.conexion.recibirError();
	}

	@Override
	public void deshacer() {
		this.conexion.escribir(Trama.DESHACER.name());
	}

	@Override
	public void rehacer() {
		this.conexion.escribir(Trama.REHACER.name());
	}

	@Override
	public boolean deshacerable() {
		this.conexion.escribir(Trama.DESHACERABLE.name());
		return this.conexion.leerBooleano();
	}

	@Override
	public boolean rehacerable() {
		this.conexion.escribir(Trama.REHACERABLE.name());
		return this.conexion.leerBooleano();
	}

	@Override
	public boolean esGanador() {
		this.conexion.escribir(Trama.GANADOR.name());
		return this.conexion.leerBooleano();
	}

	@Override
	public boolean esPerdedor() {
		this.conexion.escribir(Trama.PERDEDOR.name());
		return this.conexion.leerBooleano();
	}

	@Override
	public int getIntentos() {
		this.conexion.escribir(Trama.INTENTOS.name());
		return this.conexion.leerEntero();
	}

	@Override
	public List<Color> getColores(int posicion) {
		this.conexion.escribir(Trama.COLORES.name());
		this.conexion.escribir(posicion);
		int tam = this.conexion.leerEntero();
		List<Color> colores = new ArrayList<Color>();
		for (int i = 0; i < tam; i++) {
			colores.add(this.conexion.recibirColor());
		}
		return colores;
	}

	@Override
	public int getVacas(int posicion) {
		this.conexion.escribir(Trama.VACAS.name());
		this.conexion.escribir(posicion);
		return this.conexion.leerEntero();
	}

	@Override
	public int getToros(int posicion) {
		this.conexion.escribir(Trama.TOROS.name());
		this.conexion.escribir(posicion);
		return this.conexion.leerEntero();
	}


}
