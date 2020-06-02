package Hilos;

public class lavadero extends Thread {
	
	private String nombre;
	private int tiempo;
	
	public lavadero(String n, int t){
		nombre = n;
		tiempo = t;
	}
	
	public void run(){
		
		try{
			
			sleep(tiempo);
			
		}catch(InterruptedException e){
			
		}
		
		System.out.println("Terminamos " + nombre + "Tiempo " + tiempo);
		
	}
	
	
}
