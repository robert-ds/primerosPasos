package Recursividad;

public class recursividadIndirecta {
	
	static void metodoA(char x){
		
		if(x > 'A'){
			metodoB(x);
			System.out.println(x);
		}
		
	}
	
	static void metodoB(char x){
		
		metodoA(--x);
		
	}
	
	
	public static void main(String[] arg){
		
		metodoA('Z');
		
	}
	
}
