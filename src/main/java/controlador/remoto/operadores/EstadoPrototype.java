package controlador.remoto.operadores;

import controlador.local.JugarControladorLocal;

public class EstadoPrototype extends Operador {

	public EstadoPrototype(JugarControladorLocal jugar) {
		super(jugar);
	}

	@Override
	public void ejecutar() {
		this.conexion.escribir(this.controlador.getEstado().ordinal());
	}

}
