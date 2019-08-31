package controlador.remoto.operadores;

import controlador.local.JugarControladorLocal;

public class GanadorPrototype extends Operador {

	public GanadorPrototype(JugarControladorLocal jugar) {
		super(jugar);
	}

	@Override
	public void ejecutar() {
		this.conexion.escribir(((JugarControladorLocal) this.controlador).esGanador());
	}

}
