package tp3;

public class CerealMain {
	public static void main(String[]args){
		//Creo cooperativa
		Cooperativa coop = new Cooperativa();
		//Agrego minerales preferenciales de cooperativa
		coop.addPrimario("Potasio");
		coop.addPrimario("Fosforo");
		coop.addSecundario("Calcio");
		//Creo cereales
		Cereal c1 = new Cereal("Girasol");
		Cereal c2 = new Cereal("Maiz");
		Cereal c3 = new Cereal("Trigo");
		Cereal c4 = new Cereal("Avena");
		Cereal c5 = new Pastura("Alfalfa");
		Cereal c6 = new Pastura("Trebol");
		//Agrego minerales que necesiten:
		c1.addMineral("Potasio");
		c1.addMineral("Nitrogeno");
		c1.addMineral("Fosforo");
		c2.addMineral("Potasio");
		c2.addMineral("Nitrogeno");
		c2.addMineral("Fosforo");
		
		c3.addMineral("Hierro");
		c3.addMineral("Magnesio");
		c3.addMineral("Celenio");
		c4.addMineral("Hierro");
		c4.addMineral("Magnesio");
		c4.addMineral("Celenio");
		
		c5.addMineral("Calcio");
		c5.addMineral("Potasio");
		c5.addMineral("Fosforo");
		c6.addMineral("Calcio");
		c6.addMineral("Potasio");
		c6.addMineral("Fosforo");
		//Creo lotes
		Lote l1 =new Lote("Lotecito 1", 100);
		Lote l2 =new Lote("Lotecito 2", 20);
		Lote l3 =new Lote("Lotecito 3", 30);
		Lote l4 =new Lote("Lotecito 4", 80);
		//Agrego minerales de lotes
		l1.addMineral("Potasio");
		l1.addMineral("Nitrogeno");
		l1.addMineral("Fosforo");
		l1.addMineral("Hierro");
		l1.addMineral("Magnesio");
		l1.addMineral("Celenio");
		l2.addMineral("Potasio");
		l2.addMineral("Nitrogeno");
		l2.addMineral("Fosforo");
		l3.addMineral("Calcio");
		l3.addMineral("Nitrogeno");
		l3.addMineral("Fosforo");
		l4.addMineral("Calcio");
		l4.addMineral("Potasio");
		l4.addMineral("Fosforo");
		
		//Agrego lotes y cereales
		coop.addCereal(c1);
		coop.addCereal(c2);
		coop.addCereal(c3);
		coop.addCereal(c4);
		coop.addCereal(c5);
		coop.addCereal(c6);
		coop.addLote(l1);
		coop.addLote(l2);
		coop.addLote(l3);
		coop.addLote(l4);
		
		//Pruebo
		System.out.println(coop.cerealesPuedenSembrarse(l1));
		System.out.println(coop.cerealesPuedenSembrarse(l2));
		System.out.println(coop.cerealesPuedenSembrarse(l3));
		System.out.println(coop.cerealesPuedenSembrarse(l4));
		
		System.out.println(coop.lotesPuedenSembrar(c1));
		System.out.println(coop.lotesPuedenSembrar(c2));
		System.out.println(coop.lotesPuedenSembrar(c3));
		System.out.println(coop.lotesPuedenSembrar(c4));
		System.out.println(coop.lotesPuedenSembrar(c5));
		System.out.println(coop.lotesPuedenSembrar(c6));
		
		System.out.println(coop.tipoLote(l1));
		System.out.println(coop.tipoLote(l2));
		System.out.println(coop.tipoLote(l3));
		System.out.println(coop.tipoLote(l4));
		
	}
}
