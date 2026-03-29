package curriculum.h;

public class Main {

	public static void main(String[] args) {
		// 9時間勤務で給料を計算
		Employee full = new FullTimeEmployee("E001", "正社員");
		Employee part = new PartTimeEmployee("P001", "パート社員");

		int fullWage = full.calculateDailyWage(9);
		int partWage = part.calculateDailyWage(9);

		System.out.println("正社員の給与: " + fullWage + "円");
		System.out.println("パート社員の給与: " + partWage + "円");
	}
}
