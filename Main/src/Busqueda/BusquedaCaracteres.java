package Busqueda;

public class BusquedaCaracteres {
	
	public static void main(String[] arg){
		 
		String cadena = "Hola José, Buenos Días, que TenFgas un buen Día";
		String cadenaB = "Estamos comiendo una sopa muy Deliciosa";
		
		int b;
		int buscar = 20;
		b = cadena.indexOf((int) 'F',buscar);
		System.out.println(b);
		
		int x;
		x = cadenaB.lastIndexOf((int) 'y');
		System.out.println(x);
		
		x = cadenaB.lastIndexOf("muy");
		System.out.println(x);
		
		
	}
}
