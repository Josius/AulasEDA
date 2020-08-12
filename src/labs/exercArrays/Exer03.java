package src.labs.exercArrays;

import src.vetor.Lista;

public class Exer03{
	
	public static void main(String[] args){
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("ACTIVE");
		lista.adiciona("BAD_CONTEXT");
		lista.adiciona("C14NMethodParameterSpec");
		lista.adiciona("DATA_CONVERSION");
		lista.adiciona("ECField");
		
		System.out.println(lista);
		
		lista.remove3("ACTIVE");
		
		System.out.println(lista);
		
		lista.remove3("ECField");
		
		System.out.println(lista);
		
		lista.remove3("C14NMethodParameterSpec");
		
		System.out.println(lista);
	}
}