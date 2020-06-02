package Generico;

public class MainG {
	
	public static void main(String[] arg){
		
		
		ClaseGen<Integer> objetoA = new ClaseGen<Integer>(10);
		objetoA.tipoCLase();
		 
		
		ClaseGen<Boolean> objetoB = new ClaseGen<Boolean>(true);
		objetoB.tipoCLase();
		
		
		ClaseGen<String> objetoC = new ClaseGen<String>("Cadena");
		objetoC.tipoCLase();
		
		System.out.println(objetoA.metodoGen("Hola a 1"));
		System.out.println(objetoB.metodoGen(10));
		
	}
	
}
