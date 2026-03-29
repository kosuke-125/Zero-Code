package curriculum.d;

/*
 * 共通キャラステータス
 * Player/Deamonの親クラス
 */
public class Character {
	private String name;
	private int hp;
	private int at;
	private int sp;
	
	Character(String name, int hp, int at,int sp){
		this.name =name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}
	
	// 攻撃処理(相手のhpを減らす)
	public void attack(Character target) {
		/*
		 * 直接値をいじっているので削除
		 * terget.hp -= this.at;
		 */
		target.takeDamage(this.at);
	}
	// ダメージ処理（自分のHPは自分で管理）
	 protected void takeDamage(int damage) {
	        if (damage > 0) {
	            hp -= damage;
	        }
	    }
	
	// 生存判定
	boolean isAlive() {
		return this.hp > 0;
	}
	   // privateにしたのでgetterを用意してこれらを参照させる
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getSp() {
        return sp;
    }
}
