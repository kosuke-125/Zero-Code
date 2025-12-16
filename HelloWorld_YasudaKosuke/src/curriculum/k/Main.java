package curriculum.k;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		List<Employee> employees = new ArrayList<>();
		employees.add(new FullTimeEmployee("鈴木",9));
		employees.add(new ContractEmployee("佐藤",9));
		
		SalaryReporter reporter = new SalaryReporter(); // SalaryReporterで出力するように指示
		
		for (Employee e : employees) {
			reporter.report(e); // reporterが持ってるreportというメソッドを呼ぶ
		}
	}

}
