package Classes;

public class Lanchonete_RT extends Lanchonetes{

	@Override
	protected Sanduiche fazer_sanduiche() {
		Sanduiche sanduiche;
		Ingredientes ingredientes = new Lanchonete_RT_Ingredientes();
		
		sanduiche = new Sanduiche_RT(ingredientes);
		sanduiche.setSanduiche("Sanduiche da Lanchonete RT");
		
		return sanduiche;
	}

}
