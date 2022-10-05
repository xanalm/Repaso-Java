import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prueba {

	public static void main(String[] args) throws Exception {
		try (BufferedReader in = new BufferedReader(new FileReader("res/prueba.txt"))){

			//		System.out.print("Dime tu nombre: ");
			String nombre = in.readLine();
			//		System.out.print("Dime tu edad: ");
			int edad = Integer.parseInt(in.readLine());
			System.out.printf("Nombre: %s, Edad: %d\n", nombre, edad);
			nombre += "*";
			System.out.println(nombre);

		}catch (FileNotFoundException e) {
			//hacer cosas
			throw e;
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		if(true) 
			throw new IOException("porque quiero");
	}


}
