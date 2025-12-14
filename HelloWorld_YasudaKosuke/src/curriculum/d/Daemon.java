package curriculum.d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Daemon extends Character{
	
	public Daemon(String name, int hp, int at, int sp) {
        super(name, hp, at, sp);
	}
	
	// Deamonのステータスをファイルから読み込む
	static Daemon loadDeamon(String fileName) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		String name = br.readLine();
        int hp = Integer.parseInt(br.readLine());
        int at = Integer.parseInt(br.readLine());
        int sp = Integer.parseInt(br.readLine());

        br.close();

        return new Daemon(name, hp, at, sp);
	}
}
