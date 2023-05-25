package herramientas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import datos.Pila;

public class Write {

	private final static String FICHERO1 = "C:\\Users\\JoseManuel\\Desktop\\salida1.txt";
	BufferedWriter ficheroSalida;
	
	public void importarDatos(ArrayList<Integer> pila) throws IOException {
		ficheroSalida = new BufferedWriter(new FileWriter(FICHERO1));
		
	
		for (int i = 0; i<pila.size();i++) {
			Pila pila1 = new Pila();
			pila1.
			pila.get(0);
			
			ficheroSalida.write(pila1);
			ficheroSalida.newLine();
			
		}
		ficheroSalida.close();
	}
	
}
