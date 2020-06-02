package Vec;

import java.util.Vector;

public class Vectores {
	public static void main(String[] arg){
		
		Vector v1 = new Vector();
		Vector v2 = new Vector(20);
		Vector v3 = new Vector(v2);
		
		Vector <String> vectorcito = new Vector<String>();
		
		vectorcito.addElement("nombreCadena");
		vectorcito.addElement("apellidoCadena");
		
		vectorcito.insertElementAt("CI", 2);
		
		/* ACCEDER */
		
		System.out.println(vectorcito.get(1));
		System.out.println(vectorcito.size());
		System.out.println(vectorcito.elementAt(2));
		
		/* Eliminar */
		
		vectorcito.removeElement(0);
		vectorcito.removeElement("CI");
		
		vectorcito.removeAll(vectorcito);
		
		/* Operaciones */
		
		System.out.println(vectorcito.contains("AJ"));
		System.out.println(vectorcito.indexOf("AJ"));
		
		
		
		
	}
}
