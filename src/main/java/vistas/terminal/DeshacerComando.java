package vistas.terminal;

import controlador.JugarControlador;
import vistas.MensajeVista;

public class DeshacerComando extends Comando {

	protected DeshacerComando(JugarControlador jugar) {
		super(MensajeVista.DESHACER_COMANDO.getMensaje(), jugar);
	}

	@Override
	protected void ejecutar() {
		this.jugar.deshacer();
		new JuegoVista(this.jugar);
	}

	@Override
	protected boolean activo() {
		return this.jugar.deshacerable();
	}

}
