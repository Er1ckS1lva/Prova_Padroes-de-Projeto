package classes;

public class Knight extends Character{

	@Override
	public void Name() {
		
		System.out.println("Eu sou um Guerreiro !");
		
	}
	
	public Knight() {
		fight(new SwordBehavior());
	}

}
