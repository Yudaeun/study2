package ch4;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub

		System.out.println("���� ���� jump �մϴ�.");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub

		System.out.println("turn �մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub

		System.out.println("**** ������ �����Դϴ�, ****");
	}

	
}