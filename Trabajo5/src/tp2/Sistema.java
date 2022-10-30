package tp2;

import java.util.ArrayList;

public class Sistema {
	private ArrayList<Casa>casas;
	public Sistema(){
		casas = new ArrayList<Casa>();
	}
	public void addCasa(Casa c1){
		if(!casas.contains(c1)){
			casas.add(c1);
		}
	}
	public void removeCasa(Casa c1){
		casas.remove(c1);
	}
	public boolean existeCasa(Casa c1){
		return casas.contains(c1);
	}
}
