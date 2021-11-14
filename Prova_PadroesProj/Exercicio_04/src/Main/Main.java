package Main;

import Classes.Lanchonete_CG;
import Classes.Lanchonete_JP;
import Classes.Lanchonete_RT;
import Classes.Lanchonetes;
import Classes.Sanduiche;

public class Main {

	public static void main(String[] args) {
		
		Lanchonetes CG = new Lanchonete_CG();
		Lanchonetes JP = new Lanchonete_JP();
		Lanchonetes RT = new Lanchonete_RT();
		
		Sanduiche sanduiche = CG.novo_sanduiche();
		System.out.println(sanduiche.);
		
		sanduiche = JP.novo_sanduiche();
		System.out.println(sanduiche.toString());
		
		sanduiche = RT.novo_sanduiche();
		System.out.println(sanduiche.toString());

	}

}
