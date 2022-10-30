package tp1.condiciones;

import tp1.Socio;

public class CondicionCuotaImpaga extends Condicion{
	public boolean seCumple(Socio s){
		return !s.isUltimaCuotaPaga();
	}
}
