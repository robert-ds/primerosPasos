package Generico;

public class ClaseGen<M> {
	
	M objeto;
	
	public ClaseGen(M algo){
		objeto = algo;
	}
	
	
	public void tipoCLase(){
		System.out.println("El tipo es: " + objeto.getClass().getName());
	}
	
	public static <M> String metodoGen(M x){
		String dato;
		dato = x.toString();
		
		return dato;
	}
	
}
