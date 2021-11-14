package Main;

import java.util.Random;

import Classes.Jogo_Adivinhacao;

public class main {

	public static void main(String[] args) {
		
		Random random = new Random(); 
		int chances = 10;
		int maior = 10;
		
		Jogo_Adivinhacao jogodobixo = new Jogo_Adivinhacao(maior, chances,"Jogo do Bixo");
		Jogo_Adivinhacao jogodoido = new Jogo_Adivinhacao(maior, chances,"Jogo Doido");
		
		for(int i=0; i < chances+4;i++) {
			int num = random.nextInt(maior);
			jogodobixo.chutar(num);
			jogodoido.chutar(num);
		}
		
	}

}
