package tp4.condiciones;

import java.time.LocalDate;

import tp4.Voto;

public class CondicionEmisionAntes extends Condicion{
	private LocalDate hora;
	public CondicionEmisionAntes(LocalDate hs){
		hora = hs;
	}
	@Override
	public boolean seCumple(Voto v) {
		return v.getHora().isBefore(this.hora);
	}
}
