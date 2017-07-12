package practice;

import java.util.Random;

public class Rand1 {
	public static void main(String[] args) {
		Random random = new Random(System.nanoTime());
		int ran = random.nextInt(1000000000);
		System.out.println(ran);
	
	}
}
