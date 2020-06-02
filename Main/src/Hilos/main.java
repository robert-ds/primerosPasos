package Hilos;

public class main {
	
	public static void main(String[] arg){
		
		lavadero l1,l2,l3;
		
		l1 = new lavadero("Compacto", 10 * 1000);
		l2 = new lavadero("Camioneta", 20 * 1000);
		l3 = new lavadero("Mediano", 15 * 1000);
		
		l1.start();
		l2.start();
		l3.start();
		
	}
	
}
