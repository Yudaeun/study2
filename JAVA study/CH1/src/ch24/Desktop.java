package ch24;

public class Desktop extends Computer {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub

		System.out.println("Desktop typing");
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		super.turnOff();
	}

}
