package curriculum_B;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		// 1から10まで表示
		for (int intfor = 1; intfor <= 10; intfor++) {
			System.out.println(intfor);
		}

		System.out.println("-------------");

		// 2から20までの偶数を表示
		for (int intfor2 = 2; intfor2 <= 20; intfor2 += 2) {
			System.out.println(intfor2);
		}

		System.out.println("-------------");

		// 10から1までカウントダウン
		for (int intfor3 = 10; intfor3 >= 1; intfor3--) {
			System.out.println(intfor3);
		}

		System.out.println("-------------");

		// 1から100までの合計
		int sum = 0;	// 合計を入れる箱を用意する
		for (int intfor4 = 1; intfor4 <= 100; intfor4++) {
			sum += intfor4;	// sum = sum + intfor4 と同義
		}
		System.out.println(sum);

		System.out.println("-------------");

		// 三角形を出力	
		for (int intfor5 = 1; intfor5 <= 5; intfor5++) {	// 行の数
			for (int intfor6 = 1; intfor6 <= intfor5; intfor6++) {	// intfor5の数だけ*を増やす
				System.out.print("*");	// 改行しないで*を出力
			}
			System.out.println();// 一行終わったら改行
		}

		System.out.println("-------------");




		// whileを使ってコードを書く


		// 1から10まで表示
		int iwhi = 1;// 初期値
		while (iwhi <= 10) {	// 条件がtrueの間繰り返す
			System.out.println(iwhi);
			iwhi++;	// カウントを1増やす(忘れると無限ループになる)
		}

		System.out.println("-------------");

		// 2から20まで表示
		int iwhi2 = 2;
		while (iwhi2 <=20) {
			System.out.println(iwhi2);
			iwhi2 += 2;	// 偶数だから2ずつ増やす
		}
		System.out.println("-------------");

		// 10から1までカウントダウン
		int iwhi3 = 10;
		while (iwhi3 >=1) {
			System.out.println(iwhi3);
			iwhi3 --;
		}

		System.out.println("-------------");

		// 1から100までの合計を表示
		int iwhi4 = 1;	// カウント用の変数
		int sumwhi = 0;	// 合計用の箱を用意

		while (iwhi4 <= 100){
			sumwhi += iwhi4;	// sumwhi = sumwhi + iwhi4
			iwhi4++;	// iwhiを１個ずつ増やす
		}
		System.out.println(sumwhi);

		System.out.println("-------------");

		// ユーザーから数値を入力して、0で終了
		Scanner scanner = new Scanner(System.in);	// 入力用スキャナ

		int number = 1;		// 初期値0以外なら何でもok

		while (number != 0){
			System.out.println("数値を入力してください(0で終了):");
			number = scanner.nextInt();	// 数値を入力

			if (number != 0){
				System.out.println("入力された数値:" + number);
			}


		}
		System.out.println("終了しました");
		scanner.close();	// スキャナを閉じる

		for (int number1 = 1; number1 <= 9; number1++) {

			for (int number2 = 1; number2 <= 9; number2++) {
				int result = number1 * number2;
				String result1;
				if (result < 10) {
					result1 = "0";
				} else {
					result1 = "";
				}
				// フォーマット使用によりif文削除
				System.out.print(String.format("%02d" , number1 ) + "*" + String.format("%02d" , number2 )+ "=" + String.format("%02d" ,result));
				if (number2 < 9) {
					System.out.print("||");
				} else {
					System.out.println();
				}

			}
		}

		int number1 = 1;

		while (number1 != 0) {
			System.out.println("数値を入力してください(0で終了):");

			if (scanner.hasNextInt()) {
				number1 = scanner.nextInt();
				if (number1 != 0) {
					System.out.println("入力された数値:" + number1);
				}
			} else {
				System.out.println("数値以外が入力されました。もう一度入力してください。");
				scanner.next(); // 誤入力を読み飛ばす
			}
		}

		System.out.println("終了しました");
		scanner.close();
	}

}
