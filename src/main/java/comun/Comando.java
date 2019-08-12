package comun;

import vistas.terminal.TerminalVista;

public abstract class Comando extends TerminalVista {
	
	protected String titulo;
	
	protected Comando(String titulo) {
		this.titulo = titulo;
	}
	
	protected abstract void ejecutar();
	
	protected abstract boolean activo();
	
	String getTitulo() {
		return this.titulo;
	}

}
