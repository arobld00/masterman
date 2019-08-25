package controlador.remoto.operadores;

import controlador.local.InicioControladorLocal;

public class InicioPrototype extends Operador {

	public InicioPrototype(InicioControladorLocal inicio) {
		super(inicio);
	}

	@Override
	public void ejecutar() {
		((InicioControladorLocal) this.controlador).comenzar();
	}

}
