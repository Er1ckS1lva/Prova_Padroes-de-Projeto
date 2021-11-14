package Classes;

public class Lanchonete_CG extends Lanchonetes{

	@Override
	protected Sanduiche fazer_sanduiche() {
		Sanduiche sanduiche;
		Ingredientes ingredientes = new Lanchonete_CG_Ingredientes();
		
		sanduiche = new Sanduiche_CG(ingredientes);
		sanduiche.setSanduiche("Sanduiche da Lanchonete CG");
		
		return sanduiche;
	}

}
