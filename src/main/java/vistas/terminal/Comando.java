package vistas.terminal;

import controlador.JugarControlador;

abstract class Comando extends comun.Comando {
	
	protected JugarControlador jugar;
	
	protected Comando(String titulo, JugarControlador jugar) {
		super(titulo);
		this.jugar = jugar;
	}

}
