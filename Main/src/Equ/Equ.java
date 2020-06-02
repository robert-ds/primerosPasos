package Equ;

public class Equ {
	
	public static void main(String[] arg){
		
		String nombre = "José";
		String nombreA = "José";
		
		if(nombre.equalsIgnoreCase("josé")){
			System.out.println("Iguales");
		}
		
		String cadena = new String("Hola José, esta es ua cadena");
		//Inicio
		if(cadena.startsWith("Hola Ji")){
			System.out.println("Sí");
		}else{
			System.out.println("No");			
		}
			
		//Final
		if(cadena.endsWith("ena")){
			System.out.println("Sí");
		}else{
			System.out.println("Sí");			
		}
		
		String cad = "Esta es la Cadena Vamos";
		System.out.println(cad.regionMatches(false, 11, "cad", 0, 3));
		
		String cade = "Esta es una Cadena para este ejemplo";
		System.out.println(cade.charAt(10));
		
		char arreglo[] = new char[20];
		cade.getChars(0, 3, arreglo, 0);
		
		System.out.println(arreglo);
		
		System.out.println(cade.substring(6,14));
		System.out.println(cade.substring(9));
	}
	
}
