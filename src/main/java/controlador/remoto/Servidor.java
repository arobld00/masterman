package controlador.remoto;

import controlador.remoto.operadores.OperadorPrototype;

public class Servidor {
	
	private TCPIP conexion;
	
	private OperadorPrototype operador;
	
	private LogicaServidor logica;
	
	private Servidor() {
		this.conexion = TCPIP.crearSocketServidor();
		this.operador = new OperadorPrototype(conexion);
		this.logica = new LogicaServidor();
		this.logica.crearOperadores(this.operador);
	}
	
	private void ejecutar() {
		Trama trama = null;
		do {
			String linea = this.conexion.leer();
			System.out.println("acaba de llegar por socket: " + linea);
			trama = Trama.conversor(linea);
			if (trama != Trama.DESCONECTAR) {
				operador.ejecutar(trama);
			}
		} while (trama != Trama.DESCONECTAR);
		this.conexion.desconectar();
	}
	
	public static void main(String[] args) {
		new Servidor().ejecutar();
	}

}
