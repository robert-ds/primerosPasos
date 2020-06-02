package bits;

public class Manipulacion {
	
	public static void main(String[] arg){
		int numero = 20;
		System.out.println("Este es el Resultado em BIN: " + Integer.toBinaryString(numero));
		
		int numeroI = numero << 3;
		
		System.out.println("Este es el Resultado "+ Integer.toBinaryString(numeroI));
		
		System.out.println(numero);
		System.out.println(numeroI);
		
		int numeroD = numero >> 3;
		
		System.out.println("Este es el número D en BIN " + numeroD);
		System.out.println(" normal: " + numero);
		System.out.println(" >> D: " + numeroD);
		
		int numeroDS = -1 >>> 3;
		System.out.println("Desplazamiento sin Signo "+ numeroDS);
		
		int numA = 88;
		int numB = 150;
		
		int numAnd = numA & numB;
		System.out.println("AND " + numAnd);
		
		int numOr = numA | numB;
		System.out.println("OR " + numOr);
		
		int numXor = numA ^ numB;
		System.out.println("XOR " + numXor);
		
		int numC = 90;
		int numNot = ~numC;
		System.out.println("NOT" + numNot);
		
		
		
	}
	
}
