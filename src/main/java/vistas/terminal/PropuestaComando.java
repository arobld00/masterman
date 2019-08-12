package vistas.terminal;

import java.util.List;

import controlador.JugarControlador;
import tipo.Color;
import vistas.MensajeVista;
import tipo.Error;

public class PropuestaComando extends Comando {
	
	PropuestaComando(JugarControlador jugar) {
		super(MensajeVista.PROPONER_COMANDO.getMensaje(), jugar);
	}

	@Override
	protected void ejecutar() {
		Error error;
		do {
			List<Color> colores = new CombinacionPropuestaVista(this.jugar).leer();
			error = this.jugar.agregarCombinacionPropuesta(colores);
			if (error != null) {
				new ErrorVista(error).escribir();
			}
		} while (error != null);
		new JuegoVista(this.jugar);
	}

	@Override
	protected boolean activo() {
		return true;
	}
	

}
