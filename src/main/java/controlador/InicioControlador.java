package controlador;

import modelo.Estado;
import modelo.Juego;

public class InicioControlador extends Controlador {
	
	public InicioControlador(Juego juego, Estado estado) {
		super(juego, estado);
	}
	
	public void comenzar() {
		this.estado.siguiente();
	}

	@Override
	public void accept(VisitadorControladores visitador) {
		visitador.visit(this);
	}

}
