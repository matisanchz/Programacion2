package tp1.comparadores;

import java.util.Comparator;

import tp1.Socio;

public class ComparadorApellidoNombre implements Comparator<Socio>{

	@Override
	public int compare(Socio s1, Socio s2) {
		int res = s1.getApellido().compareTo(s2.getApellido());
		if(res==0){
			return s1.getNombre().compareTo(s2.getNombre());
		}
		return res;
	}
	
}
