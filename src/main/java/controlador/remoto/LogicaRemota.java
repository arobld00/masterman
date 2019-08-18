package controlador.remoto;

import controlador.Logica;
import modelo.EstadoEnum;

public class LogicaRemota extends Logica {
	
	private TCPIP conexion;
	
	public LogicaRemota() {
		this.conexion = TCPIP.crearSocketCliente();
		this.sesion = new SesionRemota(this.conexion);
		this.controladores.put(EstadoEnum.INICIO, new InicioControladorRemoto(this.sesion, this.conexion));
		this.controladores.put(EstadoEnum.EN_PARTIDA, new JugarControladorRemoto(this.sesion, this.conexion));
		this.controladores.put(EstadoEnum.FIN, new ResumenControladorRemoto(this.sesion, this.conexion));
		this.controladores.put(EstadoEnum.SALIR, null);
	}

	public void desconectar() {
		this.conexion.desconectar();
	}

}
