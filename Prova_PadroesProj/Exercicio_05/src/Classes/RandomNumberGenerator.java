package Classes;

import java.util.Random;

public class RandomNumberGenerator {
	
	private static RandomNumberGenerator gerador;
	
	
	private RandomNumberGenerator() {}

	public static synchronized int getSingleton(int max) {
		if (gerador == null) {
			gerador = new RandomNumberGenerator();
		}
		return gerador.novoNum(max);
	}
	
	
	private int novoNum(int max) {
		Random random = new Random(); 
		int num = random.nextInt(max);
		return num;
	}
	

}
