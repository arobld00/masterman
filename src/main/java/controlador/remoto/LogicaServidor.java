package controlador.remoto;

import controlador.local.LogicaLocal;
import controlador.remoto.operadores.InicioPrototype;
import controlador.remoto.operadores.OperadorPrototype;

public class LogicaServidor extends LogicaLocal {

	public void crearOperadores(OperadorPrototype operador) {
		operador.agregar(Trama.COMENZAR, new InicioPrototype(this.inicio));
		operador.agregar(Trama.ESTADO, new EstadoPrototype(this.jugar));
		operador.agregar(Trama.DESHACER, new DeshacerPrototype(this.jugar));
		operador.agregar(Trama.REHACER, new RehacerPrototype(this.jugar));
		operador.agregar(Trama.DESHACERABLE, new DeshacerablePrototype(this.jugar));
		operador.agregar(Trama.REHACERABLE, new RehacerablePrototype(this.jugar));
		operador.agregar(Trama.GANADOR, new GanadorPrototype(this.jugar));
		operador.agregar(Trama.PERDEDOR, new PerdedorPrototype(this.jugar));
		operador.agregar(Trama.INTENTOS, new IntentosPrototype(this.jugar));
		operador.agregar(Trama.COLORES, ColoresPrototype(this.jugar));
		operador.agregar(Trama.COMBINACION_PROPUESTA, CombinacionPrototype(this.jugar));
	}

}
