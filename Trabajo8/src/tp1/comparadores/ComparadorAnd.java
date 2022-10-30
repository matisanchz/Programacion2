package tp1.comparadores;

import java.util.Comparator;

import tp1.Socio;

public class ComparadorAnd implements Comparator<Socio>{
	private Comparator<Socio> c1;
	private Comparator<Socio>c2;
	public ComparadorAnd(Comparator<Socio> c1, Comparator<Socio> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public int compare(Socio s1, Socio s2) {
		int resu = c1.compare(s1,s2);
        if (resu == 0)
            return c2.compare(s1,s2);
        return resu;
	}
	
}
