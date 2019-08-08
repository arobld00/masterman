package vistas.terminal;

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
	public void visit(InicioControlador inicio) {
		this.inicioVista.interactuar(inicio);
	}

	@Override
	public void visit(PropuestaControlador propuesta) {
		this.propuestaVista.interactuar(propuesta);
	}

	@Override
	public void visit(ResumenControlador resumen) {
		this.resumenVista.interactuar(resumen);
	}
	
}
