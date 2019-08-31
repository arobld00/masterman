package controlador.remoto.operadores;

import controlador.local.JugarControladorLocal;

public class TorosPrototype extends Operador {

	public TorosPrototype(JugarControladorLocal jugar) {
		super(jugar);
	}

	@Override
	public void ejecutar() {
		int posicion = this.conexion.leerEntero();
		this.conexion.escribir(((JugarControladorLocal) this.controlador).getToros(posicion));
	}

}
