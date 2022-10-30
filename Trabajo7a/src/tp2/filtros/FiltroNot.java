package tp2.filtros;

import tp2.Documento;

//Punto D
public class FiltroNot extends Filtro{
	private Filtro f;
	public FiltroNot(Filtro f){
		this.f=f;
	}
	@Override
	public boolean seCumple(Documento d) {
		return !this.f.seCumple(d);
	}
	
	
}
