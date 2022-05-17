package ch26;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		
		return num1*num2;
	}

	@Override
	public int div(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2==0)
			return ERROR;
		return num1/num2;
	}

	public void showInfo() {
		System.out.println("모두 구현했습니다.");
	}
	
}
