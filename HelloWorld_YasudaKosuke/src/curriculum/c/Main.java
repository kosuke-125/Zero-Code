package curriculum.c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player player = new Player();
		CPU cpu = new CPU();

		/*
		 * 終了条件がランダムなのでtrueを使う
		 * breakでプログラムを止めるのを忘れずに！
		 */
		while (true) { //勝つまで続くループ

			int playerHand = -1; // 正しい入力がされていないことを表す初期値

			// ===== 入力チェックループ =====
			while (true) { //正しい入力かどうかのチェックするループ
				System.out.println("グー(0), チョキ(1), パー(2)のいずれかの数字を入力:");

				String input = scanner.nextLine(); // 行そのまま読むので何でも受け取る

				try {
					playerHand = Integer.parseInt(input); // 受け取ったものを数字に変換する

					if (playerHand < 0 || playerHand > 2) { //0,1,2,以外はやり直し
						System.out.println("0〜2の数字を入力してください。");
						continue;
					}
					break; // 正常入力 → 抜ける
					
					// 上記以外の例外が出るとすぐにcatchを探す
				} catch (NumberFormatException e) { // 例外(文字)を対応する
					System.out.println("数字を入力してください。");
				}
			}

			int cpuHand = cpu.getHand(); // 結果を表示

			System.out.println("あなたの手:" + player.handName(playerHand));
			System.out.println("コンピュータの手:" + player.handName(cpuHand));

			int result = player.judge(playerHand, cpuHand);

			if (result == 1) {
				System.out.println("あなたの勝ちです!");
				break;  // 勝ったら終了
			} else if (result == 0) {
				System.out.println("あいこです。もう一度!");
			} else {
				System.out.println("あなたの負けです。もう一度!");
			}
		}
		scanner.close();
	}

}
