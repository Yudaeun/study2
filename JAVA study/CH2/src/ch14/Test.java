package ch14;

class Outer2{
	int outNum=100;
	static int sNum=200;
	
	Runnable getRunnable(final int i) {
		final int num=10;
		return new Runnable(){//Ŭ���� �̸��� �������� ���� ������ Ŭ���� �̸��� ���ְ� �ٷ� ����:�͸���Ŭ����

			int localNum=1000;
			@Override
			public void run() {
				//run �޼��尡 ȣ��ǰ� ������ �״�� ������ �ǵ� i�� localNum ���� ������������
				//���ÿ� ���� ������ ������ �޼��� ȣ���� ������ ���� ���������� �Ű������� ������� �ȴ�.
				//�ٵ� ���߿� �ٽ� run()�� ȣ��� �� �ֱ� ������ run()�ȿ��� ���� �����ϸ� �ȵȴ�.
				//�׷��� final�� ó���ؼ� ���ÿ� ������ �ʰ� �Ѵ�.(���ȭ��)
				//�ȵ���̵� ���α׷��ֿ��� ���� ����ϰ�, �׷��� ������ ������������ ���� ������ �� ����.
				System.out.println(i+" "+num+" "+localNum+" "+outNum+" "+Outer2.sNum);
				
			}
			
		};
	}
	Runnable runnable=new Runnable() {
		//�͸� ���� Ŭ������ ����� �� ��° ���
		public void run() {
			System.out.println("Runnable class");
		}
	};
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer2 out=new Outer2();
		Runnable runner=out.getRunnable(100);
		runner.run();
		
		out.runnable.run();
		
	}

}
