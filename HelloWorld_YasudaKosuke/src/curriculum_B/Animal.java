package curriculum_B;

public class Animal {
	private String name;
	private double length;
	private int speed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;  // this を使う
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
