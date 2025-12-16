package curriculum.c;

import java.util.Random; // ランダムにするためにインポートする

public class CPU {

	Random random = new Random();

	// ランダムで手を出す
	int getHand () {
		return random.nextInt(3); // 0,1,2のみなので3を入れておく
	}
	/*
	 * ソースが重複しており、Playerクラスにまとめたため削除
	 * // それぞれの手の名前を返す
		String handName(int hand) { // 数字を文字列に変換
			if(hand == 0) return "グー";
			if(hand == 1) return "チョキ";
			return "パー";*/
}
