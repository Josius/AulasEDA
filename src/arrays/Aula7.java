//AULA 07: VETORES E ARRAYS: ADD ELEMENTO EM QUALQUER POSIÇÃO
package src.arrays;

import src.vetor.Vetor;

public class Aula7{
	
	public static void main(String[] args){
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		
		vetor.adiciona(1, "A");
		
		System.out.println(vetor);
		
		vetor.adiciona(2, "D");
		
		System.out.println(vetor);
	}
}