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

//2-Com reflexion	
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
	
	public T busca(int posicao){
		
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
		this.tamanho--;
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
	
	//EXERCICIOS
	//01 com problema, se modificar a busca(T elemento), tambem precisa modificar aqui
	/*
	public boolean contem(T elemento){
		
		for(int i=0; i<this.tamanho; i++){
			if(this.elementos[i].equals(elemento)){
				return true;
			}
		}
		return false;
	}
	*/
	//01 correto
	public boolean contem(T elemento){
		
		int pos = busca(elemento);
		if(pos > -1){
			return true;
		}
		return false;
		
		//o cód. de cima tem a mesma função que o de baixo
		
		//return busca(elemento) > -1; //ou >= 0
	}
	
	//02
	public int ultimoIndice(T elemento){
		
		for(int i=this.tamanho-1; i>=0; i--){
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
	
	//03 - PRECISEI MUDAR O NOME DESTA FUNÇÃO POR CAUSA DA FUNÇÃO DA LINHA 91
	public void remove3(T elemento){
		
		int pos =  this.busca(elemento);
		if(pos > -1){
			this.remove(pos);
		}
	}
	
	//04
	public T obtem(int posicao){
		return this.busca(posicao);	
	}
	
	//05
	public void limpar(){
		
		//opção 1
		//this.elementos = (T[])new Object[this.elementos.length];
		
		//opção 2
		//this.tamanho = 0;
		
		//opção 3
		for(int i=0; i<this.tamanho; i++){
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}
	
	//06
	
}

//1 - Instanciar um construtor genérico não é permitido no java; há duas opções para contornar esse erro.


