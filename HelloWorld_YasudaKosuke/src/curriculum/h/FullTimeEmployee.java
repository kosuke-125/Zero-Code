package curriculum.h;

public class FullTimeEmployee extends Employee{
	private static final int HOURLY_RATE = 1200; // 時給

	// コンストラクタ(new演算子を呼び出す)
	public FullTimeEmployee(String id,String name) {
		super(id,name); // 親クラスのコンストラクタを呼び出す
	}
	@Override // 親クラスのメソッドと一致しているか確認
	// 給与計算(残業8h 超過分は25％増し)
	public int calculateDailyWage(int hoursWorked) {
		int regularHours = Math.min(hoursWorked,8); // 小さいほうを返す
		// 大きいほうを返す(8時間を引いて-にならないように0を入れる)
		int overtimeHours = Math.max(hoursWorked - 8,0); 

		return regularHours * HOURLY_RATE + (int)(overtimeHours * HOURLY_RATE * 1.25);
	}
}

