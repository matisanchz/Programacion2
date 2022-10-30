package tp2.comparadores;

import java.util.Comparator;

import tp2.Elemento;

public class ComparadorNot implements Comparator<Elemento>{
	private Comparator<Elemento> c1;
	public ComparadorNot(Comparator<Elemento> c1) {
		this.c1 = c1;
	}
	@Override
	public int compare(Elemento e1, Elemento e2) {
		int res = c1.compare(e1, e2);
		return res*-1;
	}
}
