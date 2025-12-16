package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		int hourWorked = 9;

		// Billable型のリスト
		List<Billable>employees = new ArrayList<>();
		employees.add(new FullTimeEmployee("001", "鈴木一郎"));
		employees.add(new FullTimeEmployee("002", "田中花子"));
		employees.add(new ContractEmployee("003", "佐藤太郎"));
		employees.add(new ContractEmployee("004", "加藤美香"));

		// 社員の型を意識せずに処理
		for(Billable b : employees) {
			/*
			 * インターフェイスにgetIDなどが定義されていないので
			 * BillableからEmployeeにキャストする
			 */
			Employee emp = (Employee) b;
			int cost = b.costForDay(hourWorked);
			System.out.println(emp.getId() + ":" + emp.getName() + "の日給は" + cost + "円です。");
		}
	}
}
