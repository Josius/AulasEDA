//AULA 11: VETORES E ARRAYS: CONFIGURAR TIPO DINAMICAMENTE

package src.aula11;

import src.vetor.Lista;

public class Aula11{
	
	public static void main(String[] args){
		
		Lista<String> vetor = new Lista<String>(1);
		
		vetor.adiciona("Elemento");
		vetor.adiciona("1");
		
		System.out.println(vetor);
	}
}