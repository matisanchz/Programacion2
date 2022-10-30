package tp2.condiciones;

import java.time.LocalDate;

import tp2.Elemento;

public class CondicionCreadoAntes extends Condicion{
	private LocalDate fecha;

	public CondicionCreadoAntes(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public boolean seCumple(Elemento e) {
		return e.getFechaCreacion().compareTo(this.fecha)<0;
	}
}
