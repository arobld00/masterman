package controlador.remoto.operadores;

import controlador.local.JugarControladorLocal;

public class DeshacerablePrototype extends Operador {

	public DeshacerablePrototype(JugarControladorLocal jugar) {
		super(jugar);
	}

	@Override
	public void ejecutar() {
		this.conexion.escribir(((JugarControladorLocal) this.controlador).deshacerable());
	}

}
