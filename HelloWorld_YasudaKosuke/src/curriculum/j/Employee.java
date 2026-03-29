package curriculum.j;

public abstract class Employee implements Billable {
	private String id;
	private String name;

	// コンストラクタで初期化
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	@Override
	public abstract int costForDay(int hourWorked);
}
