package tp1.condiciones;

import tp1.Socio;

public class CondicionPagoMas extends Condicion{
	private double precio;
	public CondicionPagoMas(double precio){
		super();
		this.precio = precio;
	}
	@Override
	public boolean seCumple(Socio s) {
		return s.pagoMas(this.precio);
	}
	
	
}
