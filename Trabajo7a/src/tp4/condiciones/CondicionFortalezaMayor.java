package tp4.condiciones;

import tp4.Ficha;

public class CondicionFortalezaMayor extends Condicion{
	private int fortaleza;
	public CondicionFortalezaMayor(int fortaleza){
		this.fortaleza = fortaleza;
	}
	@Override
	public boolean seCumple(Ficha f) {
		return f.getFortaleza()>this.fortaleza;
	}
}
