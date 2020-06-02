package Streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copiarArchivo {

	public FileInputStream fi;
	public FileOutputStream fo;
	public byte[] b;
	public File archivoE, archivoS;
	
	public copiarArchivo(String[] arg){
		
		if(arg.length == 2){
			
			try {
				archivoE = new File(arg[0]);
				archivoS = new File(arg[1]);							
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(e.getMessage());
				System.exit(0);
			}
			
		}else{
			System.out.println("Tenemos el Original");
		}
		
	}
	
	public void duplicar(){
		
		System.out.println("Arrancamos " + System.currentTimeMillis());
		
		try {
			fi = new FileInputStream(archivoE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fo = new FileOutputStream(archivoS);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		b = new byte[(int)archivoE.length()];
		System.out.println("Listo! " + System.currentTimeMillis());
		
		
		try {
			fi.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Terminamos de Leer " + System.currentTimeMillis());
		
		try {
			fo.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fi.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Terminamos de Escribir " + System.currentTimeMillis());
		
	}
	
	
	
	public static void main(String[] arg){
		
		copiarArchivo cp = new copiarArchivo(arg);
		cp.duplicar();
		
	}
	
}
