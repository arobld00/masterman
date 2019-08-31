package controlador.remoto.operadores;

import controlador.local.JugarControladorLocal;

public class IntentosPrototype extends Operador {

	public IntentosPrototype(JugarControladorLocal jugar) {
		super(jugar);
	}

	@Override
	public void ejecutar() {
		this.conexion.escribir(((JugarControladorLocal) this.controlador).getIntentos());
	}

}
