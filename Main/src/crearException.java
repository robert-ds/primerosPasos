
public class crearException {

	public static void main(String[] arg){
		try{
			System.out.println("Provocando Excepciones");
			throw new miException();
		}catch(miException e){
			System.out.println(e.exceptionError());
		}
	}
	
}
