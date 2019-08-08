package modelo;

import java.util.ArrayList;

class Registro {
	
	private ArrayList<Memento> mementos;
	
	private Juego juego;
	
	private int anterior;
	
	Registro(Juego juego) {
		this.juego = juego;
		this.mementos = new ArrayList<Memento>();
		this.mementos.add(anterior, this.juego.crearMemento());
		this.anterior = 0;
	}
	
	void registrar() {
		for (int i = 0; i < this.anterior; i++) {
			this.mementos.remove(0);
		}
		this.anterior = 0;
		this.mementos.add(this.anterior, this.juego.crearMemento());
	}
	
	void deshacer(Juego juego) {
		this.anterior++;
		juego.set(this.mementos.get(this.anterior));
	}
	
	void rehacer(Juego juego) {
		this.anterior--;
		juego.set(this.mementos.get(this.anterior));
	}
	
	boolean deshacer() {
		return this.anterior < this.mementos.size() - 1;
	}
	
	boolean rehacer() {
		return this.anterior >= 1;
	}
	
	void reiniciar() {
		this.mementos = new ArrayList<Memento>();
		this.mementos.add(anterior, this.juego.crearMemento());
		this.anterior = 0;
	}
	
}
