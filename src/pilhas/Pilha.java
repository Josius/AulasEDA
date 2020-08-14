package src.pilhas;

import src.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T>{
	
	public Pilha(){
		super();
	}
	
	public Pilha(int capacidade){
		super(capacidade);
	}
	
	public void empilha(T elemento){
		super.adiciona(elemento);
	}
	
	public T topo(){
		if(this.estaVazia()){
			return null;
		}
		
		return this.elementos[tamanho-1];
	}
	
	public T desempilha(){
		if(this.estaVazia()){
			return null;
		}
		
		return this.elementos[--tamanho];
		
//		Acima equivalente a abaixo		
		
		/*
		T elemento = this.elementos[tamanho-1];
		tamanho--;
		return elemento;*/
	}
}