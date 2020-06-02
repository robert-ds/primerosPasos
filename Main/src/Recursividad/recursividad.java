package Recursividad;

public class recursividad {
	
	static long factorial(int n){
		
		if(n <= 1){
			return 1;			
		}else{
			long resultado = n * factorial(n-1);
			return resultado;
		}
		
	}
	
	public static void main(String[] arg){
		
		int n = -5;
		
		System.out.println(factorial(n));
		
		
	}
	
}
