package curriculum.h;

public abstract class Employee {
	private String employeeId; //社員ID
	private String name; // 名前
	
	// コンストラクタ
	public Employee(String id,String name) {
		this.employeeId = id;
		this.name = name;
	}
	public String getEmployeeId() {
		return this.employeeId;
	}
	public String getName() {
		return this.name;
	}
	
	// 抽象メソッド(サブクラスで実装必須)
	public abstract int calculateDailyWage(int hoursWorked); 
}
