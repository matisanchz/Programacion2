package tp2.filtros;

import tp2.Documento;

//Punto F
public class FiltroContenido extends Filtro{
	private String contenido;
	public FiltroContenido(String frase){
		contenido = frase;
	}
	@Override
	public boolean seCumple(Documento d) {
		return d.getContenido().contains(this.contenido);
	}
	
}
