package tp3.condiciones;

import tp3.Planta;

public class CondicionClasificacion extends Condicion{
	private String clasificacion;
	public CondicionClasificacion(String c){
		clasificacion = c;
	}
	@Override
	public boolean seCumple(Planta p) {
		return p.getClasificacion().equals(this.clasificacion);
	}
}
