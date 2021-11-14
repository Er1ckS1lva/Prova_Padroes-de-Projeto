package Classes;

public class Lanchonete_JP extends Lanchonetes{

	@Override
	protected Sanduiche fazer_sanduiche() {
		Sanduiche sanduiche;
		Ingredientes ingredientes = new Lanchonete_JP_Ingredientes();
		
		sanduiche = new Sanduiche_JP(ingredientes);
		sanduiche.setSanduiche("Sanduiche da Lanchonete JP");
		
		return sanduiche;
	}

}
