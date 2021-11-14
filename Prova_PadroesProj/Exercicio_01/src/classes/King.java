package classes;

public class King extends Character{

	@Override
	public void Name() {
		
		System.out.println("Eu sou o Rei !");
		
	}
	
	public King() {
		fight(new BowBehavior());
	}

}
