package ch25;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wipe();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	public void washCar() {} //������ �޼���. �߻�޼��尡 �ƴ�. �ʿ��� ��쿡 �����Ǹ� �ؼ� ����ϸ� �ȴ�. �̷� �޼��带 �Ÿ޼����� �Ѵ�.
	final public void run() {
		startCar();
		drive();
		wipe();
		stop();
		turnOff();
		washCar();
	}
}
