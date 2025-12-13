package curriculum.k;

public class SalaryReporter {
	public void report(Employee e) {
		System.out.println(e.getName() + "さんの給料は" + e.calculateSarary() + "円です。");
	}
}
