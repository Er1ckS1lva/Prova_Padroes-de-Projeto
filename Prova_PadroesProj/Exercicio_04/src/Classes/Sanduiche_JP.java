package Classes;

public class Sanduiche_JP extends Sanduiche{
	
	Ingredientes ingredientes;
	
	public Sanduiche_JP(Ingredientes ingredientes) {
		this.ingredientes = ingredientes;
		
	}

	@Override
	public void montar() {
		this.pao = ingredientes.novo_Pao();
		this.queijo = ingredientes.novo_Queijo();
		this.presunto = ingredientes.novo_Presunto();
		this.salada = ingredientes.novo_Salada();
		
	}
}
