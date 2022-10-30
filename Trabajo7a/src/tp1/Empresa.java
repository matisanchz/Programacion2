package tp1;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<ProductoQuimico> productos;
	public Empresa(){
		productos = new ArrayList<ProductoQuimico>();
	}
	
	public ArrayList<ProductoQuimico> listadoAgroqTratanEnfermedad(Cultivo c, Enfermedad e){
		ArrayList<ProductoQuimico> aux = listadoAgroqTratanEnfermedad(e);
		ArrayList<ProductoQuimico> resultado = new ArrayList<ProductoQuimico>();
		for(ProductoQuimico p: aux){
			if(!p.existeCultivoDesaconsejado(c)){
				resultado.add(p);
			}
		}
		return resultado;
	}
	
	public ArrayList<ProductoQuimico> listadoAgroqTratanEnfermedad(Enfermedad e){
		ArrayList<ProductoQuimico> aux = new ArrayList<ProductoQuimico>();
		for(ProductoQuimico p: productos){
			if(p.trataEnfermedad(e)){
				aux.add(p);
			}
		}
		return aux;
	}
	
	public void addProducto(ProductoQuimico p){
		if(!productos.contains(p)){
			productos.add(p);
		}
	}
}
