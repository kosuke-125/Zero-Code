package curriculum.g;

public class Employee {
	private String employeeId; // 社員ID
	private String name; // 名前
	
	public void setEmployeeId(String id) { // 社員IDを設定するメソッド
		this.employeeId = id;
	}
	public String getEmployeeId() { // 社員IDを取得するメソッド
		return this.employeeId;
	}
	public void setName(String name) { // 名前を設定するメソッド
		this.name = name;
	}
	public String getName() { // 名前を取得するメソッド
		return this.name;
	}
}
