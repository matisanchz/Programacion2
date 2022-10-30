package tp1;

import java.util.Stack;

public class Pila {
	private Stack<String>elementos;
	public Pila(){
		elementos=new Stack<String>();
	}
	public Stack<String> getElementos() {
		return ((Stack<String>)elementos.clone());
	}
	

}
