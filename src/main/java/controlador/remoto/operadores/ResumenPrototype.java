package controlador.remoto.operadores;

import controlador.local.ResumenControladorLocal;

public class ResumenPrototype extends Operador {

	public ResumenPrototype(ResumenControladorLocal resumen) {
		super(resumen);
	}

	@Override
	public void ejecutar() {
		boolean nueva = this.conexion.leerBooleano();
		((ResumenControladorLocal) this.controlador).reiniciar(nueva);
	}

}
