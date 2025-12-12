package curricilum.i;

public abstract class Employee {
	protected String id;
	protected String name;
	private int hoursWorked;

	// コンストラクタ
	public Employee(String id, String name){
		this.id = id;
		this.name = name;
		this.hoursWorked = hoursWorked;
	}
	// 社員ID取得
	public String getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	// 全員が必ず実装する「日給の計算」
	public abstract int calculateDailyWage();
}
