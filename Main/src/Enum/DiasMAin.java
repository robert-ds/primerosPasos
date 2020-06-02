package Enum;

public class DiasMAin {
	
	public enum dias{
		LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO;
		String clima,climap;
		
		private dias(){
			this.clima = "Soleado";
		}
		
		private void pronostico(String clima){
			this.clima = clima;
		}
		
		public String getClima(){
			return clima;
		}
		
		public void setClima(String Clima){
			this.clima = clima;
		}
		
		
	}
	
	public static void main(String[] arg){
		dias dia = dias.LUNES;
		dias dia2 = dias.MARTES;
		
		System.out.println(dia.name());
		System.out.println(dia.toString());
		System.out.println(dia.ordinal());
		System.out.println(dia.compareTo(dia2));
		System.out.println(dia.values());
	}
}
