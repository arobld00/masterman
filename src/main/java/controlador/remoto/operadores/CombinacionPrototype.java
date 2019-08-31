package controlador.remoto.operadores;

import java.util.ArrayList;
import java.util.List;

import controlador.local.JugarControladorLocal;

import tipo.Color;

public class CombinacionPrototype extends Operador {

	public CombinacionPrototype(JugarControladorLocal jugar) {
		super(jugar);
	}

	@Override
	public void ejecutar() {
		int tam = this.conexion.leerEntero();
		List<Color> colores = new ArrayList<Color>();
		for (int i = 0; i < tam; i++) {
			colores.add(this.conexion.recibirColor());
		}
		this.conexion.escribir(((JugarControladorLocal) this.controlador).agregarCombinacionPropuesta(colores));
	}

}
