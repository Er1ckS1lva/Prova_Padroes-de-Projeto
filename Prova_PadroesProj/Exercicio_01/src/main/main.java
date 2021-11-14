package main;

import classes.Queen;
import classes.King;
import classes.Troll;
import classes.Knight;

public class main {

	public static void main(String[] args) {
		
		Queen rainha = new Queen();
		King rei = new King();
		Troll troll = new Troll();
		Knight guerreiro = new Knight();
		
		rainha.Name();
		rainha.Atacar();
		
		rei.Name();
		rei.Atacar();
		
		troll.Name();
		troll.Atacar();
		
		guerreiro.Name();
		guerreiro.Atacar();
		

	}

}
