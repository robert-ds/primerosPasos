
public class Main {
	public static void main(String[] arg){
		try{
			int numero = Integer.parseInt("L");
			System.out.println("Bloque 1");
			
		}catch(Exception e){
			System.out.println("Bloque 2");
			//e.printStackTrace();
		}finally{
			System.out.println("Bloque 3");			
		}
		
		
	}
}
