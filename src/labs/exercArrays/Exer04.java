package src.labs.exercArrays;

import src.vetor.Lista;

public class Exer04{
	
	public static void main(String[] args){
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("ACTIVE");
		lista.adiciona("BAD_CONTEXT");
		lista.adiciona("C14NMethodParameterSpec");
		lista.adiciona("DATA_CONVERSION");
		lista.adiciona("ECField");
		
		System.out.println(lista.obtem(0));
		System.out.println(lista.obtem(2));
		System.out.println(lista.obtem(4));
	}
}