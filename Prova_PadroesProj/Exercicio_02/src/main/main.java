package main;

import classes.Assinantes;
import classes.Editora;

public class main {

	public static void main(String[] args) {
		
		
		Editora revista1 = new Editora("Revista 01 - Janeiro",4,"2021","www.editoraabril.com.br");	
		
    	Assinantes assn1 = new Assinantes("Erick Silva Almeida");
    	Assinantes assn2 = new Assinantes("Pedro Ottávio");
    	Assinantes assn3 = new Assinantes("Dovahkin");
    	Assinantes assn4 = new Assinantes("Ezequier");
    	Assinantes assn5 = new Assinantes("Veigar");	
    	
    	revista1.Assinar(assn1);
    	revista1.Assinar(assn2);
    	revista1.Assinar(assn3);
    	revista1.Assinar(assn4);
    	revista1.Assinar(assn5);
    	
    	revista1.Assinantes();
    	revista1.Cancelar(assn5);
    	revista1.Assinantes();
    	
    	revista1.novoVolume("Revista 01 - Fevereiro",1,"2021","www.editoraabril.com.br");

	}

}
