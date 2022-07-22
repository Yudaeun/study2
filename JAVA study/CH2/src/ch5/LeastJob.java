package ch5;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다,.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub

		System.out.println("쉬고 있거나 현재 할당된 통화 수가 가장 적은 상담원에게 배분합니다.");
	}
	

}
