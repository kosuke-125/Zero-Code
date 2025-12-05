package curriculum_B;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {

		// 配列の全要素を順番に表示
		int[] array1 = {1,2,3,4,5};
		for (int i = 0; i < 5 ; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("----------");
		// 配列の全要素を逆順に表示
		int[] array2 = {10,20,30,40,50};
		for (int i1 = 0; i1 < 5 ; i1++) {
			System.out.println(array2[i1]);
		}

		System.out.println("----------");
		// 配列の全要素の合計値を求めて表示
		int[] array3 = {3,5,7,9,11};
		int sum = 0; // 合計の箱を用意
		for (int i2 = 0; i2 < array3.length; i2++){
			sum += array3[i2];
		}
			System.out.println("合計値は" + sum);

		System.out.println("----------");
		// 配列の最大最小値を求めて表示
		int[] array4 = {12,7,9,21,5,18};
		int max = array4[0];	// 最大値の箱を用意
		int min = array4[0];	// 最小値の箱を用意

		for (int i3 = 1; i3  < array4.length; i3++) {
			if (array4[i3] > max) {
				max = array4[i3];
			}
			if (array4[i3] < min) {
				min = array4[i3];
			}
		}
		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);

		System.out.println("----------");
		// 配列を用意し、すべての要素を2倍し表示
		int[] array5 = {1,2,3,4,5};
		for (int value : array5) {
			System.out.println(value * 2);
		}

		System.out.println("----------");
		// コンソール入力した値が含まれているか否か表示
		int[] array6 = {4,7,10,15,20};
		Scanner scanner = new Scanner(System.in);
		System.out.print("数値を入力してください: ");
		int input = scanner.nextInt();

		boolean found = false;	// 見つかったかどうか記録する箱
		for (int value1 : array6) {	//	配列の中の一つずつ取り出してvalueに代入
			if (value1 == input) {	// 入力された数と一致するか確かめる
				found = true;	// 見つかったからtrue
				break;	// 探す必要がないからループを抜ける
			}
		}
		if (found) {
			System.out.println("入力した値は配列に含まれています。");
		} else {
			System.out.println("入力した値は配列に含まれていません。");
		}

		scanner.close();

		System.out.println("----------");
		// 2次元配列を用意し、配列のすべての要素を表示
		int[][] array7 = {{1, 2}, {3, 4}, {5, 6}};

		for (int i4 = 0; i4 < array7.length; i4++) { // 行を回す
			for (int j = 0; j < array7[i4].length; j++) { // 列を回す
				System.out.print(array7[i4][j] + " ");
			}
			System.out.println(); // 行の終わりで改行
		}
		// 二次元配列を使ってすべての要素を足して表示
		int[][] array8 = {{10, 20, 30},{40, 50,60},{70, 80, 90}};
			int sum1 = 0;
			for (int i5 = 0; i5 < array8.length; i5++) { // 行を回す
				for (int j1 = 0; j1 < array8[i5].length; j1++) { // 列を回す
					sum1 += array8[i5][j1]; // 要素を足す
				}
			}
			System.out.println("合計値は" + sum1);

			System.out.println("----------");
		// 2次元配列を使って最大最小値を表示
		int[][] array9 = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
		int max1 = array9[0][0];
		int min1 = array9[0][0];

		for (int i6 = 0; i6 < array9.length; i6++) {
			for (int j2 = 0; j2 < array9.length; j2++) {
				if (array9[i6][j2] > max1) {
					max1 = array9[i6][j2];
				}
				if (array9[i6][j2] < min1) {
					min1 = array9[i6][j2];
				}
			}
		}
		System.out.println("最小値は" + max1);
		System.out.println("最小値は" + min1);

		System.out.println("----------");
		// 三次元配列を使ってすべてを表示
		int[][][] array10 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
		for (int i7 = 0; i7 < array10.length; i7++){
			for	(int j3 = 0; j3 < array10[i7].length; j3++){
				for (int k = 0; k < array10[i7][j3].length; k++) { 
					System.out.print(array10[i7][j3][k]);
					if(k <array10[i7][j3].length -1) {
						System.out.print(",");
					}
				}
				System.out.println(); // 1行分の出力が終わったら改行
			}
		}
	} 
}
