package curriculum_B;

public class Question5 {

	/*
	 * 引数なし
	 * 戻り値なし
	 * "Hello, World!" を表示
	 */
	// Q1のメソッド
	public static void helloWorld() {
		System.out.println("Hello, World!");
	}
	/*
	 * 引数：整数 (int num)
	 * 戻り値：整数（引数の2倍の値）
	 */
	// Q2のメソッド
	public static int doubleValue(int num){
		return num * 2;
	}
	/*
	 * 引数：整数 (int num)戻り値：true（偶数なら）、false（奇数なら）
	 */
	public static boolean isEven(int num) {
		return num %2 == 0;
	}
	public static void main(String[] args) {
		// Q1の呼び出し
		helloWorld();
		// Q2の呼び出し
		int result = doubleValue(10);
		System.out.println("10 を 2 倍すると " + result + " です。");

		// Q3の呼び出し
		int num1 = 7;
		int num2 = 10;

		if(isEven(num1)) {
			System.out.println(num1 + "は偶数です。");
		} else {
			System.out.println(num1 + "は奇数です。");
		}
		if (isEven(num2)) {
			System.out.println(num2 + " は偶数です。");
		} else {
			System.out.println(num2 + " は奇数です。");
		}

	}
}
