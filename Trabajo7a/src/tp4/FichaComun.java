package tp4;

public class FichaComun extends Ficha {
	private int poderDestruccion;

	public FichaComun(String nombre, int fortaleza, int espacio,
			int poderDestruccion) {
		super(nombre, fortaleza, espacio);
		this.poderDestruccion = poderDestruccion;
	}

	@Override
	public double getPoderDestruccion() {
		return this.poderDestruccion;
	}

	public void setPoderDestruccion(int poderDestruccion) {
		this.poderDestruccion = poderDestruccion;
	}
	
	
	
}
