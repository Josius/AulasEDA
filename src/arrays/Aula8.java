//AULA 08: VETORES E ARRAYS: AUMENTAR CAPACIDADE DO VETOR
package src.arrays;

import src.vetor.Vetor;

public class Aula8{
	
	public static void main(String[] args){
		
		Vetor vetor = new Vetor(3);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		System.out.println(vetor);
		vetor.adiciona("F");
		System.out.println(vetor);
		vetor.adiciona("G");
		
		System.out.println(vetor);
		
	}
}