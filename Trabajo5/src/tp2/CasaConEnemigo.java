package tp2;

public class CasaConEnemigo extends Casa{
	private Casa enemistad;
	public CasaConEnemigo(String nombre, int capacidad, Casa enemistad){
		super(nombre, capacidad);
		this.enemistad = enemistad;
	}
	
	public boolean esAdmisible(Alumno a1){
		return(super.esAdmisible(a1)&&!this.enemistad.esAdmisible(a1));
	}
}
