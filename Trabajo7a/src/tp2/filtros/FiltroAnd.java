package tp2.filtros;

import tp2.Documento;

//Punto H
public class FiltroAnd extends Filtro{
	private Filtro f1;
	private Filtro f2;
	public FiltroAnd(Filtro f1, Filtro f2){
		this.f1=f1;
		this.f2=f2;
	}
	@Override
	public boolean seCumple(Documento d) {
		return f1.seCumple(d)&&f2.seCumple(d);
	}
	
}
