package vistas.terminal;

import controlador.InicioControlador;
import controlador.JugarControlador;
import controlador.ResumenControlador;
import vistas.Vista;

public class TerminalVista extends Vista {
	
	private InicioVista inicioVista;
	
	private JugarVista jugarVista;
	
	private ResumenVista resumenVista;
	
	public TerminalVista() {
		this.inicioVista = new InicioVista();
		this.jugarVista = new JugarVista();
		this.resumenVista = new ResumenVista();
	}

	@Override
	public void visit(InicioControlador inicio) {
		this.inicioVista.interactuar(inicio);
	}

	@Override
	public void visit(JugarControlador jugar) {
		this.jugarVista.interactuar(jugar);
	}

	@Override
	public void visit(ResumenControlador resumen) {
		this.resumenVista.interactuar(resumen);
	}
	
}
