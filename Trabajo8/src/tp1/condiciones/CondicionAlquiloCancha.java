package tp1.condiciones;

import tp1.Socio;

public class CondicionAlquiloCancha extends Condicion{
	private int id;
	public CondicionAlquiloCancha(int id){
		super();
		this.id=id;
	}
	@Override
	public boolean seCumple(Socio s) {
		return s.alquiloCancha(this.id);
	}
}
