package vistas.terminal;

import controlador.JugarControlador;

class JugarVista {
	
	void interactuar(JugarControlador jugar) {
		new JugarMenu(jugar).ejecutar();
	}

}
