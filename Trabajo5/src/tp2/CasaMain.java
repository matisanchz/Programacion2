package tp2;

public class CasaMain {
	public static void main(String args[]){
		//Creo el sistema:
		Sistema s1 = new Sistema();
		//Creo casas:
		Casa c1 = new Casa("Gryffindor", 100);
		Casa c2 = new CasaExigente("Slytherin", 100);
		Casa c3 = new Casa ("Hufflepuff", 100);
		Casa c4 = new CasaConEnemigo("Ravenclaw", 100, c3);
		//Agrego las casas al sistema:
		s1.addCasa(c1);
		s1.addCasa(c2);
		s1.addCasa(c3);
		s1.addCasa(c4);
		//Agrego cualidadees de la casa
		c1.addCualidad("Valor");
		c1.addCualidad("Fuerza");
		c1.addCualidad("Audacia");
		c2.addCualidad("Ambicion");
		c2.addCualidad("Determinacion");
		c2.addCualidad("Astucia");
		c3.addCualidad("Justicia");
		c3.addCualidad("Lealtad");
		c3.addCualidad("Paciencia");
		c4.addCualidad("Creatividad");
		c4.addCualidad("Erudicion");
		c4.addCualidad("Inteligencia");
		//Creo alumnos:
		Alumno a1 = new Alumno("Harry Potter");
		Alumno a2 = new Alumno("Ron Weasley");
		Alumno a3 = new Alumno("Hermione Granger");
		Alumno a4 = new Alumno("Lucius Malfoy");
		Alumno a5 = new Alumno("Draco Malfoy");
		Alumno a6 = new Alumno("Cedric Diggory");
		Alumno a7 = new Alumno("Luna Lovegood");
		//Agrego cualidades a alumnos:
		a1.addCualidad("Valor");
		a1.addCualidad("Fuerza");
		a1.addCualidad("Audacia");
		a2.addCualidad("Valor");
		a2.addCualidad("Fuerza");
		a2.addCualidad("Audacia");
		a3.addCualidad("Valor");
		a3.addCualidad("Fuerza");
		a3.addCualidad("Audacia");
		a4.addCualidad("Ambicion");
		a4.addCualidad("Determinacion");
		a4.addCualidad("Astucia");
		a5.addCualidad("Ambicion");
		a5.addCualidad("Determinacion");
		a5.addCualidad("Astucia");
		a6.addCualidad("Justicia");
		a6.addCualidad("Lealtad");
		a6.addCualidad("Paciencia");
		a7.addCualidad("Creatividad");
		a7.addCualidad("Erudicion");
		a7.addCualidad("Inteligencia");

		//Agrego familiares a alumnos:
		a4.addFamiliar(a5);
		a5.addFamiliar(a4);
		//Agrego alumnos a casas:
		c1.addAlumno(a1);
		c1.addAlumno(a2);
		c1.addAlumno(a3);
		c1.addAlumno(a4);
		c1.addAlumno(a5);
		c1.addAlumno(a6);
		c1.addAlumno(a7);
		c2.addAlumno(a1);
		c2.addAlumno(a2);
		c2.addAlumno(a3);
		c2.addAlumno(a4);
		c2.addAlumno(a5);
		c2.addAlumno(a6);
		c2.addAlumno(a7);
		c3.addAlumno(a1);
		c3.addAlumno(a2);
		c3.addAlumno(a3);
		c3.addAlumno(a4);
		c3.addAlumno(a5);
		c3.addAlumno(a6);
		c3.addAlumno(a7);
		c4.addAlumno(a1);
		c4.addAlumno(a2);
		c4.addAlumno(a3);
		c4.addAlumno(a4);
		c4.addAlumno(a5);
		c4.addAlumno(a6);
		c4.addAlumno(a7);
		
		//Imprimo alumnos de las casas:
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
