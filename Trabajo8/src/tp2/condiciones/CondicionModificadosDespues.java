package tp2.condiciones;

import java.time.LocalDate;

import tp2.Elemento;

public class CondicionModificadosDespues extends Condicion{
	private LocalDate fecha;

	public CondicionModificadosDespues(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public boolean seCumple(Elemento e) {
		return e.getFechaModificacion().compareTo(this.fecha)>0;
	}
	
	
}
