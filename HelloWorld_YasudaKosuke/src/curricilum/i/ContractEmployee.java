package curricilum.i;

public class ContractEmployee extends Employee {

	private static final int HOURLY_RATE = 1000;
	private int hoursWorked;

	public ContractEmployee(String id, String name, int hoursWorked) {
		super(id, name);
		this.hoursWorked = hoursWorked;
	}

	@Override
	public int calculateDailyWage() {
		return hoursWorked * HOURLY_RATE;
	}
}

