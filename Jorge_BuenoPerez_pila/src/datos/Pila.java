package datos;

import java.util.ArrayList;

public class Pila {
	
	public ArrayList<Integer> pila;
	
	public Pila() {
		
		pila = this.rellenar();
	}
	
	//Rellenara la pila de numeros hasta que el size del arrayList sea 30
	
	public ArrayList<Integer> rellenar(){
		
		ArrayList<Integer> devolver = new ArrayList<Integer>();
		
		if(devolver.size()<31) {
		 
			int numero = (int)(Math.random()*100);
			
			devolver.add(numero);
		}
		
		return devolver;
		
	}
	
	//Metodo que permite visualizar los elementos en el orden determinado
	public ArrayList<Integer> mostrar(){
		
		ArrayList<Integer> devolver = new ArrayList<Integer>();

		
		
		return devolver;
		
	}
	
	//Metodo que permite extraer numeros mientras el Array no este vacio, sacando asi el numero que esta en primera posicion
	public void getNumeros(){
		
		ArrayList<Integer> devolver = new ArrayList<Integer>();
		
		while(!devolver.isEmpty()) {
			devolver.get(0);
		}
		
	}
	


	@Override
	public String toString() {
		return "Pila [" + pila + "]";
	}
	
	
	
	
}
