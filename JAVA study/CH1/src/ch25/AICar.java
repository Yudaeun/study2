package ch25;

public class AICar extends Car{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("���� ������ �մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�.");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("�ڵ����� ����ϴ�.");
	}

	@Override
	public void wipe() {
		// TODO Auto-generated method stub
		System.out.println("�����۸� �۵���ŵ�ϴ�.");
		
	}

	@Override
	public void washCar() {
		System.out.println("�ڵ� ������ �մϴ�.");
	}
	

}
