package Classes;

public class Lanchonete_JP_Ingredientes implements Ingredientes{

	@Override
	public Pao novo_Pao() {
		// TODO Auto-generated method stub
		return new Pao_Frances();
	}

	@Override
	public Queijo novo_Queijo() {
		// TODO Auto-generated method stub
		return new Queijo_Mussarela();
	}

	@Override
	public Presunto novo_Presunto() {
		// TODO Auto-generated method stub
		return new Presunto_Frango();
	}

	@Override
	public Salada novo_Salada() {
		// TODO Auto-generated method stub
		return new Salada_Verdura();
	}

}
