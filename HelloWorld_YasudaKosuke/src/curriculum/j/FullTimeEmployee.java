package curriculum.j;

public class FullTimeEmployee extends Employee {
	private static final int HOURLY_RATE =1250;

	// コンストラクタ
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}
	@Override
	public int costForDay(int hourWorked) {
		int regularHours = Math.min(hourWorked, 8);
		int overTimeHours = Math.max(hourWorked - 8, 0);

		return regularHours * HOURLY_RATE + (int)(overTimeHours * HOURLY_RATE * 1.25);
	}

}
