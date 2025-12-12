package curricilum.i;

public class FullTimeEmployee extends Employee {

	private static final int HOURLY_RATE = 1200;
	private int hoursWorked;
	// コンストラクタ
	public FullTimeEmployee(String id, String name, int hoursWorked) {
		super(id, name);
		this.hoursWorked = hoursWorked;
	}

	@Override
	public int calculateDailyWage() {
		int regular = Math.min(hoursWorked, 8);
		int overtime = Math.max(hoursWorked - 8, 0);
		return regular * HOURLY_RATE + (int)(overtime * HOURLY_RATE * 1.25);
	}
}
