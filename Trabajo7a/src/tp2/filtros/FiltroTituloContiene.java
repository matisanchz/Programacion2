package tp2.filtros;

import tp2.Documento;

//Punto B
public class FiltroTituloContiene extends Filtro{
	private String substring;
	public FiltroTituloContiene(String palabra){
		substring = palabra;
	}
	public boolean seCumple(Documento d){
		return d.getTitulo().contains(this.substring);
	}
}
