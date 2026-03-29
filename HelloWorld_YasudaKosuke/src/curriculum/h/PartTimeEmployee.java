package curriculum.h;

	public class PartTimeEmployee extends Employee {

	    private static final int HOURLY_RATE = 1000; // 時給

	    // コンストラクタ
	    public PartTimeEmployee(String id, String name) {
	        super(id, name);
	    }
	    @Override // 親クラスのメソッドと一致しているか確認
	    // 給与計算（割増なし）
	    public int calculateDailyWage(int hoursWorked) {
	        return hoursWorked * HOURLY_RATE;
	    }
	}


