//AULA 06: VETORES E ARRAYS: VERIFICAR SE ELEMENTO EXISTE
package src.aula6;

import src.vetor.Vetor;

public class Aula6{
	
	public static void main(String[] args){
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.busca("EleMento 1"));		
		System.out.println(vetor.busca("elemento 3"));
		System.out.println(vetor.busca("elemento 4"));
		
	}
}