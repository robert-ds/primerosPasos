package imp;

public class ConversionImplicita {

	public static void main(String[] arg){
		
		//Conversion Implicita
		int numero = 10;
		float numerof = 10.1f;
		numerof = numerof + numero;
		System.out.println(numerof);
		
		//Explicita
		float numeroF = 100.1000009f;
		int numeroA = (int) numeroF;
		System.out.println(numeroA);
		
	}
	
}
