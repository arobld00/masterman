package controlador.local;

import controlador.InicioControlador;
import modelo.Sesion;
import modelo.SesionLocal;

public class InicioControladorLocal extends InicioControlador {
	
	public InicioControladorLocal(Sesion sesion) {
		super(sesion);
	}
	
	@Override
	public void comenzar() {
		((SesionLocal) this.sesion).siguiente();
	}

}
