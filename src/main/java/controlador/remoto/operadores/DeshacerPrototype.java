package controlador.remoto.operadores;

import controlador.local.JugarControladorLocal;

public class DeshacerPrototype extends Operador {

	public DeshacerPrototype(JugarControladorLocal jugar) {
		super(jugar);
	}

	@Override
	public void ejecutar() {
		((JugarControladorLocal) this.controlador).deshacer();
	}

}
