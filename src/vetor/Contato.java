package src.vetor;

public class Contato{
	
	private String nome;
	private String email;
	private String telefone;
	
	public Contato(String nome,String email,String telefone){
		
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public String toString(){
		
		return "Contato \n\tnome: " + nome + "\n\te-mail: " + email + "\n\ttelefone: " + telefone + "\n";
	}
}