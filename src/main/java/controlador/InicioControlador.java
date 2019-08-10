package controlador;

import modelo.Sesion;

public class InicioControlador extends AceptadorControlador {
	
	public InicioControlador(Sesion sesion) {
		super(sesion);
	}
	
	public void comenzar() {
		this.sesion.siguiente();
	}

	@Override
	public void accept(VisitadorControladores visitador) {
		visitador.visit(this);
	}

}
