package classes;

public class Queen extends Character{

	@Override
	public void Name() {
		
		System.out.println("Eu sou a Rainha !");
		
	}
	
	public Queen() {
		fight(new KnifeBehavior());
	}
	

}
