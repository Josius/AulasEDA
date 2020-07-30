package scr.vetor;

import java.util.Arrays;
import java.lang.StringBuilder;

public class Vetor{
	
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade){
		
		this.elementos =new String[capacidade];
		this.tamanho = 0;
	}

	public boolean adiciona(String elemento){
		
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public String busca(int posicao){
//com a negação do if abaixo, obtemos todo o tamanho do vetor que não possuí elementos em suas posições, ou seja a posição de todas as posições que não podem ser acessadas.
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao Invalida");
		}
		return this.elementos[posicao];
	}
	
	public int tamanho(){
		
		return this.tamanho;
	}
	
//O codigo abaixo faz o mesmo que o 'Aula4', porem mais elegante	
	public String toString(){
				
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i=0; i < this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("] ");
		
		return s.toString();
	}
	
//AULA 3	
	/*
	public void adiciona(String elemento){
		
		for(int i=0; i<this.elementos.length; i++){
			
			if(this.elementos[i] == null){
				
				this.elementos[i] = elemento;
				break;
			}
		}
	}
	*/
//AULA 3	
	/*
	public void adiciona(String elemento) throws Exception{
		
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}else{
			throw new Exception("Vetor ja esta cheio, nao e possivel adicionar mais elementos");
		}
	}
	*/
//Aula 4	
	/*	
	public String toString(){
		
		String s = "[";
		
		for(int i=0; i < this.tamanho-1; i++){
			s += this.elementos[i];
			s += ", ";
		}
		
		if(this.tamanho>0){
			s += this.elementos[this.tamanho-1];
		}
		
		s += "] ";
		
		return s;
		//return Arrays.toString(elementos);
	}
	*/	
}