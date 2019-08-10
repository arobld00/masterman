package controlador;

import modelo.Sesion;

public class ResumenControlador extends AceptadorControlador {
	
	public ResumenControlador(Sesion sesion) {
		super(sesion);
	}
	
	public void reiniciar(boolean nueva) {
		if (nueva) {
			this.sesion.reinciar();;
		} else {
			this.sesion.siguiente();
		}
	}
	
	@Override
	public void accept(VisitadorControladores visitador) {
		visitador.visit(this);
	}

}
