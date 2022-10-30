package tp2.comparadores;

import java.util.Comparator;

import tp2.Elemento;

public class CondicionMultiple implements Comparator<Elemento>{
	private Comparator<Elemento> c1;
	private Comparator<Elemento> c2;
	public CondicionMultiple(Comparator<Elemento> c1, Comparator<Elemento> c2){
		this.c1=c1;
		this.c2=c2;
	}
	@Override
	public int compare(Elemento e1, Elemento e2) {
		int res = c1.compare(e1, e2);
		if(res==0){
			return c2.compare(e1, e2);
		}
		return res;
	}
	
}
