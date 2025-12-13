package curriculum.j;

public class ContractEmployee extends Employee {
	private static final int HOURLY_RATE = 1000;

	// コンストラクタ
	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int costForDay(int hourWorked) {
		return hourWorked * HOURLY_RATE;
	}
}
