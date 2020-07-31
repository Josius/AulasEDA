package src.vetor;

import java.lang.reflect.Array;

public class Lista<T>{
	
	private T[] elementos;
	private int tamanho;

//1-Solução mais elegante
	public Lista(int capacidade){
		
		this.elementos = (T[])new Object[capacidade];
		this.tamanho = 0;
	}

//1-Com reflexion	
	public Lista(int capacidade, Class<T> tipoClasse){
		
		this.elementos = (T[])Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	
	public boolean adiciona(T elemento){
		
		this.aumentaCapacidade();
		
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public boolean adiciona(int posicao, T elemento){
		
		this.aumentaCapacidade();
		
		verifica(posicao);
				
//mover todos os elementos
		for(int i=this.tamanho-1; i>=posicao; i--){
			
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	private void aumentaCapacidade(){
		
		if(this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[])new Object[this.elementos.length*2];
			for(int i=0; i<this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public Object busca(int posicao){
		
		verifica(posicao);
		return this.elementos[posicao];
	}
	
	public int busca(T elemento){

		for(int i=0; i <this.tamanho; i++){
//			if(this.elementos[i].equalsIgnoreCase(elemento)){
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}

	public void remove(int posicao){
		
		verifica(posicao);
		for(int i=posicao; i<this.tamanho-1; i++){
			
			this.elementos[i] = this.elementos[i+1];
		}
		tamanho--;
	}
	
	public void remove(T elemento){
		
		int busca = busca(elemento);
		if(busca>=0){
			for(int i=busca; i<this.tamanho-1; i++){
			
				this.elementos[i] = this.elementos[i+1];
			}
			tamanho--;
			System.out.println("Removido o elemento " + elemento);
		}else{
			System.out.println("Elemento " + elemento + " nao existe no vetor");
		}
	}
	
	public int tamanho(){
		
		return this.tamanho;
	}
	
	private void verifica(int posicao){
//com a negação do if abaixo, obtemos todo o tamanho do vetor que não possuí elementos em suas posições, ou seja a posição de todas as posições que não podem ser acessadas.		
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao Invalida");
		}
	}

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
}

//1 - Instanciar um construtor genérico não é permitido no java; há duas opções para contornar esse erro.