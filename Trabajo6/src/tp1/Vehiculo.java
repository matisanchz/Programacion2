package tp1;

public class Vehiculo extends Articulo {
	private String marca;
	private double kms;
	private String patente;
	private boolean estaOcupado;
	public Vehiculo(String marca, double kms, String patente) {
		super();
		this.marca = marca;
		this.kms = kms;
		this.patente = patente;
		this.estaOcupado = false;
	}
	
	@Override
	public boolean puedeSerAlquilado() {
		return !isEstaOcupado();
	}
	
	@Override
	public void alquilar() {
		if(puedeSerAlquilado()){
			setEstaOcupado(true);
		}
	}
	
	@Override
	public void devolver() {
		setEstaOcupado(false);
	}
	
	@Override
	public boolean equals(Object o){
		try{
			Vehiculo aux = (Vehiculo) o;
			return this.getPatente().equalsIgnoreCase(aux.getPatente());
		}
		catch(Exception e){
			return false;
		}
		
	}
	

	public boolean isEstaOcupado() {
		return estaOcupado;
	}

	public void setEstaOcupado(boolean estaOcupado) {
		this.estaOcupado = estaOcupado;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getKms() {
		return kms;
	}
	public void setKms(double kms) {
		this.kms = kms;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}




	
}
