package controlador.remoto.operadores;

import controlador.local.JugarControladorLocal;

public class RehacerablePrototype extends Operador {

	public RehacerablePrototype(JugarControladorLocal jugar) {
		super(jugar);
	}

	@Override
	public void ejecutar() {
		this.conexion.escribir(((JugarControladorLocal) this.controlador).rehacerable());
	}

}
