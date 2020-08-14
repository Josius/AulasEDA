package src.pilhas;

import src.pilhas.Pilha;

public class Aula14{
	
	public static void main(String[] args){
		
		Pilha<Integer> pilha = new Pilha<Integer>(3);
		
//aumentar capacidade não está funcionando corretamente
		for(int i=1; i<=15; i++){
			pilha.empilha(i);
		}
		
		
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
	}
}