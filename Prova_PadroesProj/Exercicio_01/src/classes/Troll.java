package classes;

public class Troll extends Character{

	@Override
	public void Name() {
		
		System.out.println("Eu sou um Troll !");
		
	}
	
	public Troll() {
		fight(new AxeBehavior());
	}

}
