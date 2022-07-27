package ch14;

class Outer2{
	int outNum=100;
	static int sNum=200;
	
	Runnable getRunnable(final int i) {
		final int num=10;
		return new Runnable(){//클래스 이름이 쓰일일이 없기 때문에 클래스 이름을 없애고 바로 리턴:익명내부클래스

			int localNum=1000;
			@Override
			public void run() {
				//run 메서드가 호출되고 끝나면 그대로 끝나는 건데 i나 localNum 같은 지역변수들은
				//스택에 값이 잡히기 때문에 메서드 호출이 끝나고 나면 지역변수와 매개변수가 사라지게 된다.
				//근데 나중에 다시 run()이 호출될 수 있기 때문에 run()안에서 값을 변경하면 안된다.
				//그래서 final로 처리해서 스택에 잡히지 않게 한다.(상수화됨)
				//안드로이드 프로그래밍에서 자주 사용하고, 그렇기 때문에 지역변수들의 값을 변경할 수 없다.
				System.out.println(i+" "+num+" "+localNum+" "+outNum+" "+Outer2.sNum);
				
			}
			
		};
	}
	Runnable runnable=new Runnable() {
		//익명 내부 클래스를 만드는 두 번째 방법
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
