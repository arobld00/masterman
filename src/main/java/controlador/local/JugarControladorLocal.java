package controlador.local;

import java.util.List;

import controlador.DeshacerControlador;
import controlador.JugarControlador;
import controlador.PropuestaControlador;
import controlador.RehacerControlador;
import modelo.Sesion;
import tipo.Color;
import tipo.Error;

public class JugarControladorLocal extends JugarControlador {
	
	private PropuestaControlador propuesta;
	
	private DeshacerControlador deshacer;
	
	private RehacerControlador rehacer;
	
	JugarControladorLocal(Sesion sesion) {
		super(sesion);
		this.propuesta = new PropuestaControlador(this.sesion);
		this.deshacer = new DeshacerControlador(this.sesion);
		this.rehacer = new RehacerControlador(this.sesion);
	}
	
	@Override
	public Error agregarCombinacionPropuesta(List<Color> colores) {
		return this.propuesta.agregarPropuesta(colores);
	}
	
	@Override
	public void deshacer() {
		this.deshacer.deshacer();
	}
	
	@Override
	public void rehacer() {
		this.rehacer.rehacer();
	}
	
	@Override
	public boolean deshacerable() {
		return this.deshacer.deshacerable();
	}
	
	@Override
	public boolean rehacerable() {
		return this.rehacer.rehacerable();
	}
	
	@Override
	public boolean esGanador() {
		return this.propuesta.esGanador();
	}
	
	@Override
	public boolean esPerdedor() {
		return this.propuesta.esPerdedor();
	}
	
	@Override
	public int getIntentos() {
		return this.propuesta.getIntentos();
	}
	
	@Override
	public List<Color> getColores(int posicion) {
		return this.propuesta.getColores(posicion);
	}
	
	@Override
	public int getVacas(int posicion) {
		return this.propuesta.getVacas(posicion);
	}
	
	@Override
	public int getToros(int posicion) {
		return this.propuesta.getToros(posicion);
	}

}
