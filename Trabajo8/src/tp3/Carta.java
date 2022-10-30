package tp3;

import java.util.ArrayList;

public class Carta{
	private Ninio remitente;
	private ArrayList<String> regalos;
	public Carta(Ninio remitente){
		this.remitente = remitente;
		regalos = new ArrayList<String>();
	}
	
	
	
	@Override
	public boolean equals(Object o){
		try{
			Carta aux = (Carta) o;
			return this.getRemitente().equals(aux.getRemitente());
		}
		catch(Exception e){
			return false;
		}
	}
	
	public void agregarRegalo(String s){
		if(!existeRegalo(s)){
			regalos.add(s);
		}
	}
	
	//Que pasa si dejo la posibilidad de que lo borren desde afuera? Estoy dando el control?
	public void vaciarListaRegalos(){
		regalos.clear();
	}
	
	public boolean existeRegalo(String s){
		return regalos.contains(s);
	}
	
	public boolean tieneRegalos(){
		return !regalos.isEmpty();
	}
	public Ninio getRemitente() {
		return remitente;
	}
	public void setRemitente(Ninio remitente) {
		this.remitente = remitente;
	}
	
}
