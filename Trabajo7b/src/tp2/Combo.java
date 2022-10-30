package tp2;

import java.util.ArrayList;

public class Combo extends Servicio{
	private ArrayList<Servicio> elementos;
	public Combo(int tracking) {
		super(tracking);
		elementos = new ArrayList<Servicio>();
	}
	//Si no hago esto, solo copiaria el tracking al primer objeto, y no a los de adentro
	@Override
	public void setTracking(int tracking){
		super.setTracking(tracking);
		for(Servicio s:elementos){
			s.setTracking(tracking);
		}
	}
	
	@Override
	public String getDestinatario() {
		if(elementos.size()>0){
			return elementos.get(0).getDestinatario();
		}
		else{
			return null;
		}
	}
	@Override
	public String getDireccionDestinatario() {
		if(elementos.size()>0){
			return elementos.get(0).getDireccionDestinatario();
		}
		else{
			return null;
		}
	}
	@Override
	public String getRemitente() {
		if(elementos.size()>0){
			return elementos.get(0).getRemitente();
		}
		else{
			return null;
		}
	}
	@Override
	public String getDireccionRemitente() {
		if(elementos.size()>0){
			return elementos.get(0).getDireccionRemitente();
		}
		else{
			return null;
		}
	}
	@Override
	public double getPeso() {
		double peso = 0;
		for(Servicio s:elementos){
			peso += s.getPeso();
		}
		return peso;
	}
	
	public boolean mismaCiudad(Servicio s){
		return this.getDireccionDestinatario().equals(s.getDireccionDestinatario());
	}
	
	public void addServicio(Servicio s){
		if(!existeServicio(s)&&mismaCiudad(s)){
			s.setTracking(this.tracking);
			elementos.add(s);
		}
	}
	public void removeServicio(Servicio s){
		elementos.remove(s);
	}
	public boolean existeServicio(Servicio s){
		return elementos.contains(s);
	}
}