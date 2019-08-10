package controlador;

import java.util.List;

import modelo.Sesion;
import tipo.Error;
import tipo.Color;

public class JugarControlador extends AceptadorControlador {
	
	private PropuestaControlador propuesta;
	
	private DeshacerControlador deshacer;
	
	private RehacerControlador rehacer;

	JugarControlador(Sesion sesion) {
		super(sesion);
		this.propuesta = new PropuestaControlador(this.sesion);
		this.deshacer = new DeshacerControlador(this.sesion);
		this.rehacer = new RehacerControlador(this.sesion);
	}

	@Override
	public void accept(VisitadorControladores visitador) {
		visitador.visit(this);
	}
	
	public Error agregarCombinacionPropuesta(List<Color> colores) {
		return this.propuesta.agregarPropuesta(colores);
	}
	
	public void deshacer() {
		this.deshacer.deshacer();
	}
	
	public void rehacer() {
		this.rehacer.rehacer();
	}
	
	public boolean deshacerable() {
		return this.deshacer.deshacerable();
	}
	
	public boolean rehacerable() {
		return this.rehacer.rehacerable();
	}
	
	public boolean esGanador() {
		return this.propuesta.esGanador();
	}
	
	public boolean esPerdedor() {
		return this.propuesta.esPerdedor();
	}
	
	public int getIntentos() {
		return this.propuesta.getIntentos();
	}
	
	public List<Color> getColores(int posicion) {
		return this.propuesta.getColores(posicion);
	}
	
	public int getVacas(int posicion) {
		return this.propuesta.getVacas(posicion);
	}
	
	public int getToros(int posicion) {
		return this.propuesta.getToros(posicion);
	}

}
