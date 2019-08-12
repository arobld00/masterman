package comun;

import java.util.ArrayList;

public abstract class Menu extends TerminalVista {
	
	private static final String OPCION = "##### Elija opción #####";
	
	private ArrayList<Comando> listaComandos;
	
	public Menu() {
		this.listaComandos = new ArrayList<Comando>();
	}
	
	public void ejecutar() {
		ArrayList<Comando> comandosActivos = new ArrayList<Comando>();
		for (int i = 0; i < this.listaComandos.size(); i++) {
			if (this.listaComandos.get(i).activo()) {
				comandosActivos.add(this.listaComandos.get(i));
			}
		}
		boolean error;
		int opcion;
		do {
			error = false;
			this.io.writeln();
			this.io.writeln(Menu.OPCION);
			for (int i = 0; i < comandosActivos.size(); i++) {
				this.io.writeln((i + 1) + ") " + comandosActivos.get(i).getTitulo());
			}
			opcion = this.io.readInt("") - 1;
			if (!new Intervalo(0, comandosActivos.size()-1).incluye(opcion)) {
				error = true;
			}
		} while (error);
		comandosActivos.get(opcion).ejecutar();
	}
	
	protected void agregarComando(Comando comando) {
		this.listaComandos.add(comando);
	}

}
