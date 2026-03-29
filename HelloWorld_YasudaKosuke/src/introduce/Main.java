package introduce;

public class Main {

	public static void main(String[] args) {
	
		// weightに60を返す
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		// printメソッド呼び出し
		person1.print();
		
		// 人数のが合計
		System.out.println("合計" + Person.count + "人です。");
	}

}
