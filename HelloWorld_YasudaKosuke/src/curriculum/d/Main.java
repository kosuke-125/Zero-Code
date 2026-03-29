package curriculum.d;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // ===== Player 作成 =====
        System.out.print("プレイヤー名を入力してください: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);

        // ===== Daemon 読み込み =====
        Daemon daemon = Daemon.loadDeamon("daemon_status.txt");

        // ログ保存用
        StringBuilder log = new StringBuilder();
        log.append("=== バトル開始 ===\n");
        log.append(player.getName() + " VS " + daemon.getName() + "\n");

        // ===== 先攻決定 =====
        Character first;
        Character second;

        if (player.getSp() > daemon.getSp()) {
            first = player;
            second = daemon;
        } else if (player.getSp() < daemon.getSp()) {
            first = daemon;
            second = player;
        } else {
            // 同じ場合はランダム
            first = random.nextBoolean() ? player : daemon;
            second = (first == player) ? daemon : player;
        }

        log.append("先攻: " + first.getName() + "\n");

        int turn = 1;

        // ===== バトルループ =====
        while (player.isAlive() && daemon.isAlive()) {

            log.append("\n--- ターン " + turn + " ---\n");

            first.attack(second);
            log.append(first.getName() + " の攻撃！\n");
            log.append(second.getName() + " HP: " + second.getHp() + "\n");

            if (!second.isAlive()) break;

            second.attack(first);
            log.append(second.getName() + " の攻撃！\n");
            log.append(first.getName() + " HP: " + first.getHp() + "\n");

            turn++;
        }

        // ===== 勝敗判定 =====
        if (player.isAlive()) {
            log.append("勝者: " + player.getName() + "\n");
        } else {
            log.append("勝者: " + daemon.getName() + "\n");
        }

        // ===== ファイル出力 =====
        FileWriter writer = new FileWriter("battle_log.txt");
        writer.write(log.toString());
        writer.close();

        System.out.println("バトル終了。結果は battle_log.txt に出力されました。");
        scanner.close();
    }
}
