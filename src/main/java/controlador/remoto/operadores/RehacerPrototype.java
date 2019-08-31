package controlador.remoto.operadores;

import controlador.local.JugarControladorLocal;

public class RehacerPrototype extends Operador {

	public RehacerPrototype(JugarControladorLocal jugar) {
		super(jugar);
	}

	@Override
	public void ejecutar() {
		((JugarControladorLocal) this.controlador).rehacer();
	}

}
