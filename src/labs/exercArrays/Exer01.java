package src.labs.exercArrays;

import src.vetor.Lista;

public class Exer01{
	
	public static void main(String[] args){
		
		//01
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("ACTIVE");
		lista.adiciona("BAD_CONTEXT");
		lista.adiciona("C14NMethodParameterSpec");
		
		System.out.println(lista.contem("ACTIVE"));
		System.out.println(lista.contem("BAD_CONTEXT"));
		System.out.println(lista.contem("ECField"));
	}
}