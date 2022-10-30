package tp2.comparadores;

import java.util.Comparator;

import tp2.Elemento;

public class ComparadorFechaCreacion implements Comparator<Elemento>{

	@Override
	public int compare(Elemento e1, Elemento e2) {
		return e1.getFechaCreacion().compareTo(e2.getFechaCreacion());
	}

}
