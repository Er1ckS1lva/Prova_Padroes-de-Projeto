package Classes;

public class Lanchonete_RT_Ingredientes implements Ingredientes{

	@Override
	public Pao novo_Pao() {
		// TODO Auto-generated method stub
		return new Pao_Bola();
	}

	@Override
	public Queijo novo_Queijo() {
		// TODO Auto-generated method stub
		return new Queijo_Cheddar();
	}

	@Override
	public Presunto novo_Presunto() {
		// TODO Auto-generated method stub
		return new Presunto_Peru();
	}

	@Override
	public Salada novo_Salada() {
		// TODO Auto-generated method stub
		return new Salada_SVerde();
	}

}
