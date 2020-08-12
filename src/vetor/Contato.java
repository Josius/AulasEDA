package src.vetor;

public class Contato{
	
	private String nome;
	private String telefone;
	private String email;
	
	public Contato(){
		
	}
	
	public Contato(String nome, String telefone, String email){
		
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String toString(){
		
		return "Contato \n\tnome: " + nome + "\n\te-mail: " + email + "\n\ttelefone: " + telefone + "\n";
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
}