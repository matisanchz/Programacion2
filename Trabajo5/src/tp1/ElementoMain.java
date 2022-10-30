package tp1;

public class ElementoMain {
	public static void main (String[]args){
		Pila p1 = new Pila();
		String o1 = new String("Objeto 1");
		String o2 = new String("Objeto 2");
		String o3 = new String("Objeto 3");
		String o4 = new String("Objeto 4");
		p1.getElementos().push(o1);
		p1.getElementos().push(o2);
		p1.getElementos().push(o3);		
		p1.getElementos().push(o4);
		
		System.out.println(p1.getElementos());
	}
}
