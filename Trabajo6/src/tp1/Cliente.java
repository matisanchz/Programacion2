package tp1;

public class Cliente {
	private int dni;
	public Cliente(int dni){
		this.dni=dni;
	}
	
	@Override
	public boolean equals(Object o){
		try{
			Cliente aux = (Cliente) o;
			return this.getDni()==(aux.getDni());
		}
		catch(Exception e){
			return false;
		}
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
}
