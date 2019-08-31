package controlador.remoto.operadores;

import controlador.local.JugarControladorLocal;

public class VacasPrototype extends Operador {

	public VacasPrototype(JugarControladorLocal jugar) {
		super(jugar);
	}

	@Override
	public void ejecutar() {
		int posicion = this.conexion.leerEntero();
		this.conexion.escribir(((JugarControladorLocal) this.controlador).getVacas(posicion));
	}

}
