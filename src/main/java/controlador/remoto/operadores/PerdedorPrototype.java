package controlador.remoto.operadores;

import controlador.local.JugarControladorLocal;

public class PerdedorPrototype extends Operador {

	public PerdedorPrototype(JugarControladorLocal jugar) {
		super(jugar);
	}

	@Override
	public void ejecutar() {
		this.conexion.escribir(((JugarControladorLocal) this.controlador).esPerdedor());
	}

}
