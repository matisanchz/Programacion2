package tp1.condiciones;

import tp1.Socio;

public class CondicionMinoriaEdad extends Condicion{
	private static final int minoria_edad = 18;
	@Override
	public boolean seCumple(Socio s) {
		return s.getEdad()<minoria_edad;
	}
	
}
