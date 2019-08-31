package controlador.remoto;

import controlador.local.LogicaLocal;
import controlador.remoto.operadores.AmplitudPrototype;
import controlador.remoto.operadores.ColoresPrototype;
import controlador.remoto.operadores.CombinacionPrototype;
import controlador.remoto.operadores.DeshacerPrototype;
import controlador.remoto.operadores.DeshacerablePrototype;
import controlador.remoto.operadores.EstadoPrototype;
import controlador.remoto.operadores.GanadorPrototype;
import controlador.remoto.operadores.InicioPrototype;
import controlador.remoto.operadores.IntentosPrototype;
import controlador.remoto.operadores.OperadorPrototype;
import controlador.remoto.operadores.PerdedorPrototype;
import controlador.remoto.operadores.RehacerPrototype;
import controlador.remoto.operadores.RehacerablePrototype;
import controlador.remoto.operadores.ResumenPrototype;
import controlador.remoto.operadores.TorosPrototype;
import controlador.remoto.operadores.VacasPrototype;

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
		operador.agregar(Trama.COLORES, new ColoresPrototype(this.jugar));
		operador.agregar(Trama.COMBINACION_PROPUESTA, new CombinacionPrototype(this.jugar));
		operador.agregar(Trama.AMPLITUD, new AmplitudPrototype(this.jugar));
		operador.agregar(Trama.TOROS, new TorosPrototype(this.jugar));
		operador.agregar(Trama.VACAS, new VacasPrototype(this.jugar));
		operador.agregar(Trama.NUEVA_PARTIDA, new ResumenPrototype(this.resumen));
	}

}
