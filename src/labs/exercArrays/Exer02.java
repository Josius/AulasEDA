package src.labs.exercArrays;

import src.vetor.Lista;
import java.util.ArrayList;

public class Exer02{
	
	public static void main(String[] args){
		
		ArrayList<String> arrayList = new ArrayList<String>(5);
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("A");
		
		System.out.println(arrayList.lastIndexOf("A"));
		System.out.println(arrayList.lastIndexOf("As"));
		
		Lista<String> lista = new Lista<String>(5);
		lista.adiciona("Aa");
		lista.adiciona("bb");
		lista.adiciona("cc");
		lista.adiciona("Aa");
		
		System.out.println(lista.ultimoIndice("Aa"));
		System.out.println(lista.ultimoIndice("Aaa"));
		
	}
}