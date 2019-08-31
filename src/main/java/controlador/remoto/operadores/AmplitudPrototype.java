package controlador.remoto.operadores;

import controlador.local.JugarControladorLocal;

public class AmplitudPrototype extends Operador {

	public AmplitudPrototype(JugarControladorLocal jugar) {
		super(jugar);
	}

	@Override
	public void ejecutar() {
		this.conexion.escribir(this.controlador.getAmplitud());
	}

}
