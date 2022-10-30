package tp2.filtros;

import tp2.Documento;

//Punto E
public class FiltroAutor extends Filtro{
	private String autor;
	public FiltroAutor(String a){
		autor = a;
	}
	@Override
	public boolean seCumple(Documento d) {
		return d.contieneAutor(this.autor);
	}
}
