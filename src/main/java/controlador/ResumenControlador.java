package controlador;

import modelo.Sesion;

public abstract class ResumenControlador extends AceptadorControlador {
	
	public ResumenControlador(Sesion sesion) {
		super(sesion);
	}
	
	public abstract void reiniciar(boolean nueva);
	
	@Override
	public void accept(VisitadorControladores visitador) {
		visitador.visit(this);
	}

}
