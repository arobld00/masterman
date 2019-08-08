package vistas.terminal;

import controlador.Controlador;
import controlador.InicioControlador;
import controlador.PropuestaControlador;
import controlador.ResumenControlador;
import vistas.Vista;

public class TerminalVista extends Vista {
	
	private InicioVista inicioVista;
	
	private PropuestaVista propuestaVista;
	
	private ResumenVista resumenVista;
	
	public TerminalVista() {
		this.inicioVista = new InicioVista();
		this.propuestaVista = new PropuestaVista();
		this.resumenVista = new ResumenVista();
	}
	
	@Override
	public void interactuar(Controlador controlador) {
		if (controlador instanceof InicioControlador) {
			this.inicioVista.interactuar((InicioControlador) controlador);
		} else {
			if (controlador instanceof PropuestaControlador) {
				this.propuestaVista.interactuar((PropuestaControlador) controlador);
			} else {
				this.resumenVista.interactuar((ResumenControlador) controlador);
				}
			}
	}
}
