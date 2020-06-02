package Cadena;

public class Cadena {
	public static void main(String[] arg){
		
		int numero = 10;
		String cadena = String.valueOf(numero);
		
		float numerof = 10.1f;
		String cadenaF = String.valueOf(numerof);
		
		double numerod = 10.80298402d;
		String cadenad = String.valueOf(numerod);
		
		long numeroL = 1000000000;
		String cadenaL = String.valueOf(numeroL);
		
		boolean boo = true;
		String cadenaB = String.valueOf(boo);
		
		System.out.println(cadena + cadenaB);
		
	}
}
