package curriculumA;

public class Ques1_13 {
	public static void main(String [] args) {

		// 変数の型と箱を書く
		// バイト型
		byte numbyt;
		// 短整数型
		short numsho;
		// 整数型
		int numint;
		// 長整数型
		long numlon;
		// 短精度浮動小数点
		float numflo;
		// 倍精度浮動小数点
		double numdou;
		// 文字型
		char wordcha;
		// 文字列型
		String wordstr;
		// ブーリアン型
		boolean isactiveboo;

		// 各箱の中の変数を(初期値(0など)を代入して)初期化する
		// バイト型
		numbyt = 0;
		// 短整数型
		numsho = 0;
		// 整数型
		numint = 0;
		// 長整数型
		numlon = 0;
		// 短精度浮動小数点
		numflo = 0;
		// 倍精度浮動小数点
		numdou = 0;
		// 文字型
		wordcha = '\u0000';
		// 文字列型
		wordstr = null;
		// ブーリアン型
		isactiveboo = false;

		// 初期化した変数にそれぞれ値を代入していく
		numbyt = 10;
		// 短整数型
		numsho = 100;
		// 整数型
		numint = 1000;
		// 長整数型
		numlon = 10000;
		// 短精度浮動小数点
		numflo = 9.5f;
		// 倍精度浮動小数点
		numdou = 10.5;
		// 文字型
		wordcha = 'a';
		// 文字列型
		wordstr = "ハロー";
		// ブーリアン型
		isactiveboo = true;

		/*
		 * それぞれ計算をしていき結果を出す
		 * 必要に応じて型変換を行う
		 */

		System.out.println(numbyt + numsho + numint + numlon);

		// キャスト(int)をすることによって結果を整数型に変える
		System.out.println((int)(numflo + numdou));

		System.out.println(wordcha + wordstr + isactiveboo);

		System.out.println((int)(numbyt + numsho + numint + numlon + numflo + numdou));

		System.out.println(numbyt * numsho * numint * numlon);

		System.out.println(numdou / numsho);

		System.out.println(numbyt - numsho);


		/*
		 *元のコードではStringとなっており
		 *数字としての型を使えていないのでintを使う
		 */

		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num+num1));


		// 変数の宣言と代入
		String name = "山田太郎";
		int age = 18;
		double height = 170.5; // cm
		double weight = 62.2;  // kg
		String like = "寿司";
		
		// BMIの計算（身長をmに変換）
		double heightInMeters = height / 100;
		double bmi = weight / (heightInMeters * heightInMeters);
		double bmi1 = bmi; // 一人目のBMIを保存

		// 出力
		System.out.println("初めまして" + name + "です。");

		System.out.println("年齢は" + age + "歳です。");

		System.out.println("身長は" + height + "cmです。");

		System.out.println("体重は" + weight + "kgです。");

		System.out.println("好きな食べ物は" + like + "です。");

		System.out.println("BMIは" + String.format("%.1f", bmi) + "です。");


		// 再代入前に合計用の変数に一時保存
		int ageSum = age;
		double heightSum = height;
		double weightSum = weight;
		double bmiSum = bmi1; // ← ここ追加


		/*
		 * 新たな変数を再代入
		 * 型を使わないように注意する	←再宣言になってしまう
		 */

		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		like = "オムライス";
		bmi = 22.6;


		System.out.println("初めまして" + name + "です。");

		System.out.println("年齢は" + age + "歳です。");

		System.out.println("身長は" + height + "cmです。");

		System.out.println("体重は" + weight + "kgです。");

		System.out.println("好きな食べ物は" + like + "です。");

		System.out.println("BMIは" + bmi+ "です。");

		// 合計の出力
		System.out.println("初めまして" + name + "です。");
		System.out.println("年齢の合計は" + ageSum + "歳です。");
		System.out.println("身長の合計は" + heightSum + "cmです。");
		System.out.println("体重の合計は" + weightSum + "kgです。");
		System.out.println("好きな食べ物は" + like + "です。");
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です。");

		// 合計の計算
		ageSum += age;
		heightSum += height;
		weightSum += weight;
		
		// 合計の出力
        System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢の合計は" + ageSum + "歳です。");
        System.out.println("身長の合計は" + heightSum + "cmです。");
        System.out.println("体重の合計は" + weightSum + "kgです。");
        System.out.println("好きな食べ物は" + like + "です。");
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です。");
        System.out.println((ageSum >= 25));


	}




}

