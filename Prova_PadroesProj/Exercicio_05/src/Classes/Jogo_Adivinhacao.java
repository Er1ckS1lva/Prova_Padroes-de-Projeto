package Classes;

public class Jogo_Adivinhacao {
	
	private int chances;
	private int numero;
	private boolean ativo;
	private String nome;
	
	public Jogo_Adivinhacao(int maior, int chances, String nome) {
		this.numero = RandomNumberGenerator.getSingleton(maior);
		this.chances = chances;
		this.ativo = true;
		this.nome = nome;
		System.out.println("Um novo jogo foi iniciado,"+this.nome+", tem "+chances+" chances de acertar o numero");
	}
	
	
	public void chutar(int num) {
		if(this.ativo) {
			if (this.chances > 0) {
				System.out.println(this.nome+": você chutou -> "+num);
				if(num == this.numero){
					System.out.println(this.nome+": você Acertou !!!");
					this.chances = 0;
				}else {
					System.out.println(this.nome+": que pena, chute errado.");
					this.chances -= 1;
				}
			}else {
				System.out.println(this.nome+": já acabaram as chances !!!");
				this.ativo = false;
			}
		}else {
			System.out.println(this.nome+": já foi encerrado!");
		}
	}

}
