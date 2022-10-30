package tp1.comparadores;

import java.util.Comparator;

import tp1.Socio;

public class ComparadorCantAlquileresCancha implements Comparator<Socio>{
	private int id;
	public ComparadorCantAlquileresCancha(int id) {
		this.id = id;
	}
	@Override
	public int compare(Socio s1, Socio s2) {
		return s1.cantCanchasId(this.id)-s2.cantCanchasId(this.id);
	}
	
}
