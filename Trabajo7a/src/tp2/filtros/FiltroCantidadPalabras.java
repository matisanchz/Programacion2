package tp2.filtros;

import java.util.StringTokenizer;

import tp2.Documento;

//Punto G
public class FiltroCantidadPalabras extends Filtro{
	private int cantPalabras;
	public FiltroCantidadPalabras(int cantPalabras){
		this.cantPalabras=cantPalabras;
	}
	@Override
	public boolean seCumple(Documento d) {
		String frase = d.getContenido();
		StringTokenizer st = new StringTokenizer(frase);
		return st.countTokens()>=this.cantPalabras;
	}
	
}
