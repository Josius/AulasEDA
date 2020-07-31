//AULA 05: VETORES E ARRAYS: OBTER ELEMENTO DE UMA POSIÇÃO
package src.aula5;

import src.vetor.Vetor;

public class Aula5{
	
	public static void main(String[] args){
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.busca(0));		
		System.out.println(vetor.busca(1));		
		System.out.println(vetor.busca(2));		
		System.out.println(vetor.busca(3));
	}
}