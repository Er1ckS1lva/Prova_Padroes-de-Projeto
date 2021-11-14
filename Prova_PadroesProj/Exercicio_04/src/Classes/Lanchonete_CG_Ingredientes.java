package Classes;

public class Lanchonete_CG_Ingredientes implements Ingredientes{

	@Override
	public Pao novo_Pao() {
		// TODO Auto-generated method stub
		return new Pao_Integral();
	}

	@Override
	public Queijo novo_Queijo() {
		// TODO Auto-generated method stub
		return new Queijo_Prato();
	}

	@Override
	public Presunto novo_Presunto() {
		// TODO Auto-generated method stub
		return new Presunto_Frango();
	}

	@Override
	public Salada novo_Salada() {
		// TODO Auto-generated method stub
		return new Salada_SVerde();
	}

}
