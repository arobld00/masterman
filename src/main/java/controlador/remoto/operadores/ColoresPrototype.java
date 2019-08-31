package controlador.remoto.operadores;

import java.util.List;

import controlador.local.JugarControladorLocal;
import tipo.Color;

public class ColoresPrototype extends Operador {

	public ColoresPrototype(JugarControladorLocal jugar) {
		super(jugar);
	}

	@Override
	public void ejecutar() {
		int posicion = this.conexion.leerEntero();
		List<Color> colores = ((JugarControladorLocal) this.controlador).getColores(posicion);
		this.conexion.escribir(colores.size());
		for (Color color : colores) {
			this.conexion.escribir(color);
		}
	}

}
