package curriculum.d;

/*
 * 共通キャラステータス
 * Player/Deamonの親クラス
 */
public class Character {
	String name;
	int hp;
	int at;
	int sp;
	
	Character(String name, int hp, int at,int sp){
		this.name =name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}
	
	// 攻撃処理(相手のhpを減らす)
	void attack(Character terget) {
		terget.hp -= this.at;
	}
	
	// 生存判定
	boolean isAlive() {
		return this.hp > 0;
	}
}
