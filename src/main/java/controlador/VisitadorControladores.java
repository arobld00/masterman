package controlador;

public interface VisitadorControladores {
	
	void visit(InicioControlador inicio);
	
	void visit(PropuestaControlador inicio);
	
	void visit(ResumenControlador inicio);

}
