package controlador;

import modelo.Sesion;

public abstract class InicioControlador extends AceptadorControlador {
	
	public InicioControlador(Sesion sesion) {
		super(sesion);
	}
	
	public abstract void comenzar();

	@Override
	public void accept(VisitadorControladores visitador) {
		visitador.visit(this);
	}

}
