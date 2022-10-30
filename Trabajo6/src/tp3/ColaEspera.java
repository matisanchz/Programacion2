package tp3;

import java.util.ArrayList;

public class ColaEspera {
	private ArrayList<ElementoOrdenable> elementos;
	public ColaEspera(){
		elementos = new ArrayList<ElementoOrdenable>();
	}
	
	public void addElemento(ElementoOrdenable e){
		boolean encontrado = false;
		int i=0;
		while(!encontrado&&i<elementos.size()){
			if(elementos.get(i).esMayor(e)){
				i++;
			}
			else{
				encontrado = true;
			}
		}
		if(encontrado){
			elementos.add(i, e);
		}
		else{
			elementos.add(e);
		}
	}
	
	public ElementoOrdenable siguiente(){
        ElementoOrdenable sig = elementos.get(0);
        elementos.remove(0);
        return sig;
    }
	
	public boolean tieneElementos(){
		return elementos.size()>0;
	}
	
	
}
