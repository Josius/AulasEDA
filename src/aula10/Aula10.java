//AULA 10: VETORES E ARRAYS: GENERALIZAR O TIPO DO VETOR

package src.aula10;

import src.vetor.VetorObjetos;
import src.vetor.Contato;

public class Aula10{
	
	public static void main(String[] args){
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("a","@2","1-1");
		Contato c2 = new Contato("b","@3","0-1");
		Contato c3 = new Contato("c","@4","1-8");
		Contato c4 = new Contato("d","@1","8-7");
		Contato c5 = new Contato("e","@5","3-4");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		System.out.println(vetor);
		
		System.out.println(vetor.busca(c5));
		
		
		/*
		vetor.adiciona(3);
		vetor.adiciona("C");
		vetor.adiciona('f');
		vetor.adiciona("G");
		System.out.println(vetor);
		
		vetor.adiciona(1, 3.6);
		
		System.out.println(vetor);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		System.out.println(vetor);
		
		System.out.println(vetor.busca(1));
		//System.out.println(vetor.busca('f'));
				
		System.out.println(vetor);
		vetor.remove("G");
		System.out.println(vetor);
		vetor.remove(3);
		System.out.println(vetor);
		*/
	}
}