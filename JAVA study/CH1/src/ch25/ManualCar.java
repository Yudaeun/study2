package ch25;

public class ManualCar extends Car{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("사람이 운전을 합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("장애물 앞에서 브레이크를 밟아서 정지합니다.");
	}

	@Override
	public void wipe() {
		// TODO Auto-generated method stub
		System.out.println("와이퍼를 작동시킵니다.");
		
	}

}
