package tp3;

public class Pastura extends Cereal {
	private static final int min_hectareas = 50;
	public Pastura(String nombre){
		super(nombre);
	}
	@Override
	public boolean puedeSembrarse(Lote l1){
		return(super.puedeSembrarse(l1)&&esCompatible(l1));
	}
	public boolean esCompatible(Lote l1){
		return l1.getHectareas()>=min_hectareas;
	}
	
	
}
