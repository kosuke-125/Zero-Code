package curriculum.c;

public class Player {
	// それぞれの手の名前を返す
	String handName(int hand) { // 数字を文字列に変換
		if(hand == 0) return "グー";
		if(hand == 1) return "チョキ";
		return "パー";
	}
	/*
	 *  勝敗判定(戻り値で結果を返す)
	 *  1:勝ち, 0:あいこ, -1:負け
	 *  じゃんけんで手の組み合わせで勝敗を分けている
	 */
	int judge(int player, int cpu) { 
		if (player == cpu) {
			return 0;
		} else if ((player == 0 && cpu == 1) || (player == 1 && cpu == 2) || (player == 2 && cpu == 0)) {
			return 1;
		} else {
			return -1;
		}
	}

}
