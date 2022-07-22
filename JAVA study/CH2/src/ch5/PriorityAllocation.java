package ch5;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub

		System.out.println("등급이 높은 고객에게 업무능력이 우수한 상담원에게 배분합니다.");
	}

	
}
