package tp1.comparadores;

import java.util.Comparator;

import tp1.Socio;

public class ComparadorNot implements Comparator<Socio>{
	private Comparator<Socio> c1;
	public ComparadorNot(Comparator<Socio> c1) {
		this.c1 = c1;
	}
	@Override
	public int compare(Socio s1, Socio s2) {
		int res = c1.compare(s1, s2);
		return res*-1;
	}
}
