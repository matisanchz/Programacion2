package tp4;

public class FichaEspecial extends Ficha{
	public FichaEspecial(String nombre, int fortaleza, int espacio) {
		super(nombre, fortaleza, espacio);
	}
	@Override
	public double getPoderDestruccion() {
		return this.getFortaleza()/this.getEspacio();
	}
	
}
