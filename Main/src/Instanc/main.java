package Instanc;

public class main {
	
	public static void main(String[] arg){
		Number numero = 9.9;
		
		if(numero instanceof Float){
			System.out.println("Es Flotante");
		}
		
		if(numero instanceof Integer){
			System.out.println("Es Entero");			
		}
		
		if(numero instanceof Double ){
			System.out.println("Es Double");			
		}
	}
	
}
