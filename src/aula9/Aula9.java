//AULA 09: VETORES E ARRAYS: REMOVER ELEMENTO
package src.aula9;

import src.vetor.Vetor;

public class Aula9{
	
	public static void main(String[] args){
		
		Vetor vetor = new Vetor(3);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);

		vetor.remove("B");
		
		System.out.println(vetor);
		
		vetor.remove("A");
		
		System.out.println(vetor);
	}
}