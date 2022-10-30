package tp1;

import java.time.LocalDate;

public class Link extends Elemento{
	private static final String nombreInicio = "Link al elemento: ";
	private static final double tamanio = 1;
	private Elemento referencia;
	public Link(Elemento ref){
		super(nombreInicio+ref.getNombre());
		referencia = ref;
	}
	@Override
	public int getCantidad() {
		return 1;
	}
	@Override
	public double getTamanio() {
		return tamanio;
	}
	public Elemento getReferencia() {
		return referencia;
	}
	public void setReferencia(Elemento referencia) {
		this.referencia = referencia;
		this.setFechaModificacion(LocalDate.now());
	}
}
