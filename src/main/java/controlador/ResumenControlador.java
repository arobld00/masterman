package controlador;

import modelo.Estado;
import modelo.Juego;

public class ResumenControlador extends Controlador {
	
	public ResumenControlador(Juego juego, Estado estado) {
		super(juego, estado);
	}
	
	public void reiniciar(boolean nueva) {
		if (nueva) {
			this.juego.reiniciar();
			this.estado.reiniciar();
		} else {
			this.estado.siguiente();
		}
	}
	
	@Override
	public void accept(VisitadorControladores visitador) {
		visitador.visit(this);
	}

}
