package curriculum.c;

import java.util.Random; // ランダムにするためにインポートする

public class CPU {
	
	Random random = new Random();
	
	// ランダムで手を出す
	int getHand () {
		return random.nextInt(3); // 0,1,2のみなので3を入れておく
	}
	
	// 手を返す
	String handName(int hand) {
		if (hand == 0) return "グー";
		if (hand == 1) return "チョキ";
		return "パー";
	}
}
