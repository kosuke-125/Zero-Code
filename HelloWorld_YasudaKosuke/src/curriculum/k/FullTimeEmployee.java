package curriculum.k;

public class FullTimeEmployee extends Employee {
	
	public FullTimeEmployee(String name, int hours) {
		super(name, hours);
	}
	
	@Override
	public int calculateSarary() {
		int regular = Math.min(hours, 8);
        int overtime = Math.max(hours - 8, 0);
        return regular * 1200 + (int)(overtime * 1200 * 1.25);
	}
}
