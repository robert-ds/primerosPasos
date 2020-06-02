package PAvanzada;

public class Ejemplo {
	
	public static void main(String[] arg){
		int[][] arrayInts = {
				{10,90,92,45},
				{77,20,9,12},
				{40,32,11,49}
				
		};
		
		int i,j = 0;
		int buscando = 16;
		boolean encontrando = false;
		
		//Etiqueta
		buscar:
			
			for(i = 0;i<arrayInts[i].length;i++){
				for(j = 0; j < arrayInts[i].length;j++){
					if(arrayInts[i][j] == buscando){
						encontrando = true;
						break buscar;
					}
				}
				
			}
		
		if(encontrando){
			System.out.println("Encontrado" + buscando + "en " + i +", " + j);
		}else{
			System.out.println("No Encontramos " + buscando);
		}
		
	}
}
