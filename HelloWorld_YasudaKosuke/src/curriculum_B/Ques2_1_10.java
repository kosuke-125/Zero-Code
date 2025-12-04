package curriculum_B;

import java.util.Scanner;
	// スキャナを使用する際はインポートをまず書く

public class Ques2_1_10 {

	public static void main(String[] args) {

		int intnum = 75;

		if (intnum >= 60) {		// 条件がtrueの場合に実行される
			System.out.println("合格です！");
		}

		int age = 25;

		if (age >= 20 && age <= 30) {
			System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です");
		}
		int intage = 18;

		if (intage >= 20) {
			System.out.println("成人です");
			// 満たしていれば上記の処理を行う
		} else if (intage>=13 && intage <= 19) {
			System.out.println("ティーンエイジャーです");
			// 条件1を満たさず今回の条件を満たしていれば上記の処理
		}	else {  // どの条件にも当てはまらない
			System.out.println("子供です");

		}

		int x = 30;
		int y = 15;
		int z = 50;
		/*
		 * それぞれを他の２つより大きければという比べ方をしている
		 * 今回はｚが一番大きいのでelseの処理が行われた
		 */
		if (x >= y && x >= z) {
			System.out.println("一番大きいのは x: " + x);
		} else if (y >= x && y >= z) {
			System.out.println("一番大きいのは y: " + y);
		} else {
			System.out.println("一番大きいのは z: " + z);
		}


		Scanner scanner = new Scanner(System.in);  // 入力用のスキャナを作成

		System.out.print("数値を入力してください: ");
		int num = scanner.nextInt(); 
		
		/* コンソールから整数を読み取る
		*  改行は読み取らないので注意
		*/
		
		if (num > 0) {
			System.out.println("正の数です");
		} else if (num == 0) {
			System.out.println("0 です");
		} else {
			System.out.println("負の数です");
		}

		System.out.print("整数を入力してください: ");
		int value = scanner.nextInt();

		if (value % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}

		System.out.println("スコアを入力してください(0~100):");
		int score = scanner.nextInt();

		if (score >= 90) {
			System.out.println("優");
		} else if (score >= 70) {
			System.out.println("良");
		} else if (score >= 50) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}

		scanner.nextLine();// 改行消化用
		/*
		 * nextIntからnextLineを使うときは改行消化が必要
		 * nextIntはスペースや改行で区切られた数字しか読めない
		 * nextLineは改行も一緒に消化してくれる
		 */
		System.out.print("文字列を入力してください: ");
		String input = scanner.nextLine();

		if (input == null || input.trim().isEmpty()) {	// 空白だけの入力（例：" "）も空とみなす
			System.out.println("入力が無効です");
		} else {
			System.out.println("入力された内容: " + input);
		}

		
		/*
		 * switch文を書く際は各caseごとにbreak;を書く
		 * 書かなければ以降の処理を全部行ってしまうため
		 */
		
		System.out.println("数字を入力してください(1~7):");
		int day = scanner.nextInt();

		switch (day) {
		case 1: 
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
		default:
			System.out.println("無効な入力です");
		}

		System.out.println("数字を入力してください(1~12):");
		int month = scanner.nextInt();

		switch (month) {
		case 12: case 1: case 2:
			System.out.println("冬");
			break;
		case 3: case 4: case 5:
			System.out.println("春");
			break;
		case 6: case 7: case 8:
			System.out.println("夏");
			break;
		case 9: case 10: case 11:
			System.out.println("秋");
			break;
		default:
			System.out.println("無効な月です");
		}
		scanner.close();  // スキャナを閉じる（お作法として）
	}
}










