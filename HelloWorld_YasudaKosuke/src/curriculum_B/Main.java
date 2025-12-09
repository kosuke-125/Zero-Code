package curriculum_B;

public class Main {
	public static void main(String[] args) {

		// Q4 Greeting 呼び出し
		Greeting g = new Greeting();
		g.sayHello();
		
		// Q5 Animal 呼び出し
		Animal lion = new Animal();

        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);

        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}
