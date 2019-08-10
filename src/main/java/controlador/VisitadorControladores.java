package controlador;

public interface VisitadorControladores {
	
	void visit(InicioControlador inicio);
	
	void visit(JugarControlador jugar);
	
	void visit(ResumenControlador resumen);

}
