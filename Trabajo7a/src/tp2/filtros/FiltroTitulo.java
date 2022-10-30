package tp2.filtros;

import tp2.Documento;

//Punto A
public class FiltroTitulo extends Filtro{
	private String titulo;
	public FiltroTitulo(String tit){
		titulo = tit;
	}
	public boolean seCumple(Documento d){
		return d.getTitulo().equalsIgnoreCase(this.titulo);
	}
}
