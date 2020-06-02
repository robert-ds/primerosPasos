package Ternario;

public class Main {
	
	public static void main(String[] arg){
		
		int numero = 21;
		String cadena;
		
		if(numero < 20){
			cadena = "Menos";
		}else{
			cadena = "Mas";
		}
		
		System.out.println(cadena);
		
		String cadena2 = numero < 20 ? "Menos" : "Mas";
		System.out.println(cadena);
		
		
	}

}
