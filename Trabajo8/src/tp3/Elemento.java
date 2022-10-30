package tp3;

public abstract class Elemento {
	private int id;
	public Elemento(int id){
		this.id=id;
	}
	
	//Es igual para ambos elementos, lo abstraigo
	public double promedioCartasDetRegalo(String s) {
		return this.cantCartasDetRegalo(s)/this.cantCartas();
	}
	public abstract int cantCartasDetRegalo(String s);
	public abstract int cantCartasNiniosMalos();
	public abstract int cantCartas();
	
	
	@Override
	public boolean equals(Object o){
		try{
			Elemento aux = (Elemento) o;
			return this.getId()==aux.getId();
		}
		catch(Exception e){
			return false;
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
