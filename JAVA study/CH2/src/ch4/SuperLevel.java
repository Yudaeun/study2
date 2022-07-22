package ch4;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("완전 빨리 달립니다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub

		System.out.println("아주 높이 jump 합니다.");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub

		System.out.println("turn 합니다.");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub

		System.out.println("**** 고급자 레벨입니다, ****");
	}

	
}
