package tp1.comparadores;

import java.util.Comparator;

import tp1.Socio;

public class ComparadorEdad implements Comparator<Socio>{

	@Override
	public int compare(Socio s1, Socio s2) {
		return s1.getEdad()-s2.getEdad();
	}

}
