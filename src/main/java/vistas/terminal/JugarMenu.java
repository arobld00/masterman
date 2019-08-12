package vistas.terminal;

import comun.Menu;
import controlador.JugarControlador;

public class JugarMenu extends Menu {
	
	JugarMenu(JugarControlador jugar) {
		this.agregarComando(new PropuestaComando(jugar));
		this.agregarComando(new DeshacerComando(jugar));
		this.agregarComando(new RehacerComando(jugar));
	}

}
