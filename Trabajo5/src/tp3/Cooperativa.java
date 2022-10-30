package tp3;

import java.util.ArrayList;

public class Cooperativa {
	private ArrayList<Lote>lotes;
	private ArrayList<Cereal>cereales;
	private ArrayList<String>minerales_primarios;
	private ArrayList<String>minerales_secundarios;
	public Cooperativa(){
		lotes = new ArrayList<Lote>();
		cereales = new ArrayList<Cereal>();
		minerales_primarios = new ArrayList<String>();
		minerales_secundarios = new ArrayList<String>();
	}
	
	public String tipoLote(Lote l1){
		String aux = "El lote "+l1.getNombre()+" es de tipo: ";
		if(this.contienePrimarios(l1)){
			return aux+"espcial.";
		}
		else if(this.contieneSecundarios(l1)){
			return aux+"comun.";
		}
		else{
			return "No es de ningun tipo";
		}
	}
	
	public boolean contieneSecundarios(Lote l1){
		int j=0;
		for(int i = 0; i<minerales_secundarios.size(); i++){
			if(l1.existeMineral(minerales_secundarios.get(i))){
				j++;
			}
		}
		return j==minerales_secundarios.size();
	}
	
	public boolean contienePrimarios(Lote l1){
		int j=0;
		for(int i = 0; i<minerales_primarios.size(); i++){
			if(l1.existeMineral(minerales_primarios.get(i))){
				j++;
			}
		}
		return j==minerales_primarios.size();
	}
	
	public String lotesPuedenSembrar(Cereal c1){
		String aux = "Los lotes que pueden sembrar "+c1.getNombre()+" son: ";
		for(int i = 0; i<lotes.size(); i++){
			if(c1.puedeSembrarse(lotes.get(i))){
				aux+= lotes.get(i).getNombre();
			}
		}
		return aux;
	}
	
	public String cerealesPuedenSembrarse(Lote l1){
		String aux = "Los cereales que pueden sembrarse en "+l1.getNombre()+",son:";
		for(int i = 0; i<cereales.size(); i++){
			if((cereales.get(i).puedeSembrarse(l1))){
				aux+= " ";
				aux+= cereales.get(i).getNombre();
			}
		}
		return aux;
	}
	
	public void addSecundario(String s1){
		if(!existeSecundario(s1)){
			minerales_secundarios.add(s1);
		}
	}
	public void removeSecundario(String s1){
		minerales_secundarios.remove(s1);
	}
	public boolean existeSecundario(String s1){
		return minerales_secundarios.contains(s1);
	}	
	
	public void addPrimario(String s1){
		if(!existePrimario(s1)){
			minerales_primarios.add(s1);
		}
	}
	public void removePrimario(String s1){
		minerales_primarios.remove(s1);
	}
	public boolean existePrimario(String s1){
		return minerales_primarios.contains(s1);
	}
	
	public void addLote(Lote l1){
		if(!existeLote(l1)){
			lotes.add(l1);
		}
	}
	public void removeLote(Lote l1){
		lotes.remove(l1);
	}
	public boolean existeLote(Lote l1){
		return lotes.contains(l1);
	}
	
	public void addCereal(Cereal c1){
		if(!existeCereal(c1)){
			cereales.add(c1);
		}
	}
	public void removeCereal(Cereal c1){
		cereales.remove(c1);
	}
	public boolean existeCereal(Cereal c1){
		return cereales.contains(c1);
	}
	
}
