package vistas.terminal;

import tipo.Error;
import comun.IO;

class ErrorVista extends vistas.ErrorVista {
	
	ErrorVista(Error error) {
		super(error);
	}
	
	void escribir() {
		new IO().writeln(ErrorVista.MENSAJES[this.error.ordinal()]);
	}

}
