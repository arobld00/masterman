package controlador.local;

import controlador.Logica;
import modelo.SesionLocal;
import modelo.EstadoEnum;

public class LogicaLocal extends Logica {
	
	protected InicioControladorLocal inicio;
	
	protected JugarControladorLocal jugar;
	
	protected ResumenControladorLocal resumen;
	
	public LogicaLocal() {
		this.sesion = new SesionLocal();
		this.inicio = new InicioControladorLocal(this.sesion);
		this.jugar = new JugarControladorLocal(this.sesion);
		this.resumen = new ResumenControladorLocal(this.sesion);
		this.controladores.put(EstadoEnum.INICIO, this.inicio);
		this.controladores.put(EstadoEnum.EN_PARTIDA, this.jugar);
		this.controladores.put(EstadoEnum.FIN, this.resumen);
		this.controladores.put(EstadoEnum.SALIR, null);
	}

}
