package tp2;

public abstract class Servicio {
	protected int tracking;
	public Servicio(int tracking){
		this.tracking = tracking;
	}
	
	public abstract String getDestinatario();
	public abstract String getDireccionDestinatario();
	public abstract String getRemitente();
	public abstract String getDireccionRemitente();
	public abstract double getPeso();
	
	@Override
	public boolean equals(Object o){
		try{
			Servicio aux = (Servicio)o;
			return this.tracking==aux.getTracking();
		}
		catch(Exception e){
			return false;
		}
	}
	
	public int getTracking() {
		return tracking;
	}
	public void setTracking(int tracking) {
		this.tracking = tracking;
	}
	
}
