package modelo;

public class Estado {
	
	private EstadoEnum estado;
	
	public Estado() {
		this.reiniciar();
	}
	
	public void siguiente() {
		this.estado = EstadoEnum.values()[this.estado.ordinal()+1];
	}
	
	public void reiniciar() {
		this.estado = EstadoEnum.INICIO;
	}
	
	public EstadoEnum getEstado() {
		return this.estado;
	}

}
