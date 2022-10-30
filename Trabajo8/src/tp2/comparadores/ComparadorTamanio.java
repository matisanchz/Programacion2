package tp2.comparadores;

import java.util.Comparator;

import tp2.Elemento;

public class ComparadorTamanio implements Comparator<Elemento>{
	@Override
	public int compare(Elemento e1, Elemento e2) {
		double tam1 = e1.getTamanio();
		double tam2 = e2.getTamanio();
		if(tam1>tam2){
			return 1;
		}
		else if(tam1<tam2){
			return -1;
		}
		else{
			return 0;
		}
	}
}
