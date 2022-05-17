package ch25;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----AICar----");
		Car aiCar=new AICar();
		aiCar.run();
		
		System.out.println("----ManualCar----");
		Car mCar=new ManualCar();
		mCar.run();
	}

}
