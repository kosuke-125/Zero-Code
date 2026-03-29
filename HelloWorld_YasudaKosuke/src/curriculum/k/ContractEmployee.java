package curriculum.k;

public class ContractEmployee extends Employee {

	public ContractEmployee(String name, int hours) {
		super(name, hours);
	}
	
	@Override
	public int calculateSarary() {
		return hours * 1000;
	}
}
