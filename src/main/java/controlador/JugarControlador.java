package controlador;

import java.util.List;

import modelo.Sesion;
import tipo.Error;
import tipo.Color;

public abstract class JugarControlador extends AceptadorControlador {

	protected JugarControlador(Sesion sesion) {
		super(sesion);
	}

	@Override
	public void accept(VisitadorControladores visitador) {
		visitador.visit(this);
	}
	
	public abstract Error agregarCombinacionPropuesta(List<Color> colores);
	
	public abstract  void deshacer();
	
	public abstract  void rehacer();
	
	public abstract  boolean deshacerable();
	
	public abstract  boolean rehacerable();
	
	public abstract  boolean esGanador();
	
	public abstract  boolean esPerdedor();
	
	public abstract  int getIntentos();
	
	public abstract  List<Color> getColores(int posicion);
	
	public abstract  int getVacas(int posicion);
	
	public abstract  int getToros(int posicion);

}
