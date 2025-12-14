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
		while(true) { 
			System.out.println("グー(0), チョキ(1), パー(2)のいずれかの数字を入力:");
			int playerHand = scanner.nextInt();
			
			int cpuHand = cpu.getHand();
			
		System.out.println("あなたの手:" + player.handName(playerHand));
		System.out.println("コンピュータの手:" + cpu.handName(cpuHand));
		
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
