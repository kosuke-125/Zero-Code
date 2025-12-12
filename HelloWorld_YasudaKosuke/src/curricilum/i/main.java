package curricilum.i;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

		/*
		 * Employee 型のリストを作成し、複数の社員を追加
		 * オブジェクト生成して親クラスのコンストラクタにセット
		 * employeesリストに追加される
		 */
		List<Employee>employees = new ArrayList<>();
		employees.add(new FullTimeEmployee("001", "鈴木一郎",9));
		employees.add(new FullTimeEmployee("002", "田中花子",6));
		employees.add(new ContractEmployee("003", "佐藤太郎",8));
		employees.add(new ContractEmployee("004", "加藤美香",4));

		/*
		 * サブクラスを意識せず Employee として扱う
		 * 中の処理は正社員と契約社員で分かれている
		 */
		for (Employee emp : employees) { // リストを1個ずつ取り出して処理
			int wage = emp.calculateDailyWage();
			System.out.println(emp.getid() + ":" + emp.getname() + "の日給は" + wage + "円です。");
		}
	}
}
