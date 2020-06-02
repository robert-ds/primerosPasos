package basura;

public class Clase {
	
	public static void main(String[] arg){
		
		Object objeto = new Object();
		
		objeto = null;
		
		Main objeto2 = new Main();
		
		objeto2 = null;
		
		System.gc();
	}
}
