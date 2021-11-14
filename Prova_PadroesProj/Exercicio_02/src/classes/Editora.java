package classes;

import java.util.ArrayList;

public class Editora {
	
	
	private String nomeRevista;
	private int Edicao;
	private String anoPublicacao;
	private String link;
	private ArrayList<Assinantes> registrados = new ArrayList<Assinantes>();
	
	public String getNomeRevista() {
		return nomeRevista;
	}

	public void setNomeRevista(String nomeRevista) {
		this.nomeRevista = nomeRevista;
	}

	public int getEdicao() {
		return Edicao;
	}

	public void setEdicao(int edicao) {
		Edicao = edicao;
	}

	public String getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Editora(String nome, int edit, String ano, String link){
		
		this.setAnoPublicacao(ano);
		this.setEdicao(edit);
		this.setNomeRevista(nome);
		this.setLink(link);
		
	}
	
	public void Assinar(Assinantes Nome) {
		this.registrados.add(Nome);
		System.out.println("\n"+Nome.getNome()+" se tornou um novo asssinantes da revista  "+this.getNomeRevista());
	}
	
	public void Cancelar(Assinantes Nome) {
		this.registrados.remove(Nome);
		System.out.println("\n"+Nome.getNome()+" cancelou sua assinatura na revista "+this.getNomeRevista());
	}
	
	public void Assinantes() {
		System.out.println("\nLista de Assinantes da Revista "+getNomeRevista());
		for(int i =0; i < this.registrados.size(); i++) {
			System.out.println("* "+this.registrados.get(i).getNome());
		}
	}
	
	public void novoVolume(String nome, int edit, String ano, String link){
		
		this.setAnoPublicacao(ano);
		this.setEdicao(edit);
		this.setNomeRevista(nome);
		this.setLink(link);
		
		System.out.println("\nNovo volume da revista saiu ' "+ nome + " '");
		atualizarAssinante();
	}
	
	public void atualizarAssinante() {
		
		for(int i =0; i < this.registrados.size(); i++) {
			this.registrados.get(i).Notified();
		}
		
	}

}
