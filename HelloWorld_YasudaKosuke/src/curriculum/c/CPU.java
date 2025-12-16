package curriculum.c;

import java.util.Random; // ランダムにするためにインポートする

public class CPU {

	Random random = new Random();

	// ランダムで手を出す
	int getHand () {
		return random.nextInt(3); // 0,1,2のみなので3を入れておく
	}
}
