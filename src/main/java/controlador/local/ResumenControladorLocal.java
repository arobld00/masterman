package controlador.local;

import controlador.ResumenControlador;
import modelo.Sesion;
import modelo.SesionLocal;

public class ResumenControladorLocal extends ResumenControlador {
	
	public ResumenControladorLocal(Sesion sesion) {
		super(sesion);
	}
	
	@Override
	public void reiniciar(boolean nueva) {
		if (nueva) {
			((SesionLocal) this.sesion).reinciar();
		} else {
			((SesionLocal) this.sesion).siguiente();
		}
	}

}
