package ch25;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wipe();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	public void washCar() {} //구현된 메서드. 추상메서드가 아님. 필요한 경우에 재정의를 해서 사용하면 된다. 이런 메서드를 훅메서드라고 한다.
	final public void run() {
		startCar();
		drive();
		wipe();
		stop();
		turnOff();
		washCar();
	}
}
