package src.pilhas;

import src.pilhas.Pilha;

public class Aula15{
	
	public static void main(String[] args){
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.estaVazia());
		
		pilha.empilha(9);
		
		System.out.println(pilha.estaVazia());
	}
}