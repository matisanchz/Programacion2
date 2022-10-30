package tp1.comparadores;

import java.util.Comparator;

import tp1.Socio;

public class ComparadorCuotaPaga implements Comparator<Socio>{

	@Override
	public int compare(Socio s1, Socio s2) {
		if(s1.isUltimaCuotaPaga()){
			if(s2.isUltimaCuotaPaga()){
				return 0;
			}
			else{
				return 1;
			}
		}
		else{
			if(s2.isUltimaCuotaPaga()){
				return -1;
			}
			else{
				return 0;
			}
		}
	}
	
}
