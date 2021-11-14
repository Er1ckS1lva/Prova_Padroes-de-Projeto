package classes;

public class Assinantes {
	
private String Nome;
	
	
	public Assinantes(String Nome) {
		setNome(Nome);	
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getNome() {
		return this.Nome;
	}

	public void Notified() {
		System.out.println(this.getNome() + " foi atualizado sobre o novo volume.");
	}

}
