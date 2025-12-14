package curriculum.d;

import java.util.Random;

public class Player extends Character {
	static Random random = new Random();
	
	// 名前だけ受け取って、ステータスはランダム
	Player(String name){
		super(name, random.nextInt(51) + 50, random.nextInt(11) + 10, random.nextInt(5) + 5);
	}
}
