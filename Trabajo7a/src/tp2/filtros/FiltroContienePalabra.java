package tp2.filtros;

import tp2.Documento;

//Punto C
public class FiltroContienePalabra extends Filtro{
	private String palabra;
	public FiltroContienePalabra(String palabra){
		this.palabra = palabra;
	}
	public boolean seCumple(Documento d){
		return d.contienePalabra(this.palabra);
	}
}
