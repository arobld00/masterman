package vistas.terminal;

import controlador.JugarControlador;
import vistas.MensajeVista;

public class RehacerComando extends Comando {

	protected RehacerComando(JugarControlador jugar) {
		super(MensajeVista.REHACER_COMANDO.getMensaje(), jugar);
	}

	@Override
	protected void ejecutar() {
		this.jugar.rehacer();
		new JuegoVista(this.jugar);
	}

	@Override
	protected boolean activo() {
		return this.jugar.rehacerable();
	}

}
