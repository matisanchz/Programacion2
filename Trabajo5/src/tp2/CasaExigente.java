package tp2;

import java.util.ArrayList;

public class CasaExigente extends Casa {
	public CasaExigente(String nombre, int capacidad){
		super(nombre, capacidad);
	}
	@Override
	public boolean esAdmisible(Alumno a1){
		return(super.esAdmisible(a1)&&esSangrePura(a1));
	}
	
	public boolean esSangrePura(Alumno a1){
		ArrayList<Alumno> aux = a1.getFamiliares();
		for(int i = 0; i<aux.size(); i++){
			if(tieneTodasCualidades(aux.get(i))){
				return true;
			}
		}
		return false;
	}
	
}
