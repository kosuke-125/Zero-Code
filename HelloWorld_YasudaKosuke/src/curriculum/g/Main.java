package curriculum.g;

public class Main {
	public static void main(String[] args) {
		
		// Employeeのオブジェクトを生成
		Employee emp = new Employee();
		
		// 値を設定
		emp.setEmployeeId("E002");
		emp.setName("田中花子");
		
		// メソッドで値を取得して出力
		System.out.print("社員ID:" + emp.getEmployeeId());
		System.out.println(",名前:" + emp.getName());
	}
	
}
