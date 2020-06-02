package Vec;

import java.util.ArrayList;

public class ArrayLis {
	public static void main(String[] arg){
		
		ArrayList<String> arreglo = new ArrayList<String>();
		
		arreglo.add("A");
		arreglo.add("D");
		arreglo.add("H");
		arreglo.add("L");
		arreglo.add("M");
		arreglo.add("M");
		arreglo.add("Q");
		
		arreglo.remove("D");
		arreglo.set(0, "2");
		
		System.out.println(arreglo.indexOf(2));
		arreglo.removeAll(arreglo);
	}
}
