package curriculumA;

public class Ques1_13 {
	public static void main(String [] args) {

		// 変数の型と箱を書く
		// バイト型
		byte num1;
		// 短整数型
		short num2;
		// 整数型
		int num3;
		// 長整数型
		long num4;
		// 短精度浮動小数点
		float num5;
		// 倍精度浮動小数点
		double num6;
		// 文字型
		char word1;
		// 文字列型
		String word2;
		// ブーリアン型
		boolean b;

		// 各箱の中の変数を(初期値(0など)を代入して)初期化する
		// バイト型
		num1 = 0;
		// 短整数型
		num2 = 0;
		// 整数型
		num3 = 0;
		// 長整数型
		num4 = 0;
		// 短精度浮動小数点
		num5 = 0;
		// 倍精度浮動小数点
		num6 = 0;
		// 文字型
		word1 = '\u0000';
		// 文字列型
		word2 = "";
		// ブーリアン型
		b = false;

		// 初期化した変数にそれぞれ値を代入していく
		num1 = 10;
		// 短整数型
		num2 = 100;
		// 整数型
		num3 = 1000;
		// 長整数型
		num4 = 10000;
		// 短精度浮動小数点
		num5 = 9.5f;
		// 倍精度浮動小数点
		num6 = 10.5;
		// 文字型
		word1 = 'a';
		// 文字列型
		word2 = "ハロー";
		// ブーリアン型
		b = true;

		/*
		 * それぞれ計算をしていき結果を出す
		 * 必要に応じて型変換を行う
		 */

		System.out.println(num1+num2+num3+num4);

		// キャスト(int)をすることによって結果を整数型に変える
		System.out.println((int)(num5+num6));

		System.out.println(word1+word2+b);

		System.out.println((int)(num1+num2+num3+num4+num5+num6));

		System.out.println(num1*num2*num3*num4);

		System.out.println(num6/num2);

		System.out.println(num1-num2);


		/*
		 *元のコードではStringとなっており
		 *数字としての型を使えていないのでintを使う
		 */

		int num=20;
		int num7=23;
		System.out.println("ハローJAVA"+(num+num7));


		// 変数の宣言と代入
		String name = "山田太郎";
		int age = 18;
		double height = 170.5; // cm
		double weight = 62.2;  // kg
		String like = "寿司";

		// BMIの計算（身長をmに変換）
		double heightInMeters = height / 100;
		double bmi = weight / (heightInMeters * heightInMeters);

		// 出力
		System.out.println("初めまして、" + name + "です。");
		
		System.out.println("年齢は" + age + "歳です。");
		
		System.out.println("身長は" + height + "cmです。");
		
		System.out.println("体重は" + weight + "kgです。");
		
		System.out.println("好きな食べ物は" + like + "です。");
		
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です。");
		
		
		
		
	}




}

