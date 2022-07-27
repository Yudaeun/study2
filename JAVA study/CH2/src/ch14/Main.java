package ch14;

class OutClass{
	private int num=10;
	private static int sNum=20;
	private InClass inClass;
	public OutClass(){
		inClass=new InClass();
	}
	class InClass{
		int iNum=100;
		//이너클래스는 외부클래스가 먼저 생성된 후에 생성된다. 그래서 정적 변수를 선언할 수 없다.
		void inTest() {
			System.out.println("외부 클래스의 인스턴스변수, 정적 변수, 내부 클래스의 인스턴스 변수:"+num+" "+sNum+" "+iNum);
		}
	}
	public void usingClass() {
		inClass.inTest();
		//만들어둔 이너 클래스의 메서드를 usingClass에서 사용한다.
	}
	static class InStaticClass {
		//정적내부 클래스
		int iNum=100;
		static int sInNum=200;
		void inTest() {
			//정적 클래스의 일반 메서드에서는 외부 클래스의 인스턴스 변수가 생성되기 전에 사용될 수 있기 때문에 사용하지 못한다.
			System.out.println("내부 클래스의 인스턴스변수, 정적 변수, 내부 클래스의 정적 변수:"+iNum+" "+sNum+" "+sInNum);
		}
		static void sTest() {
			//정적 내부 클래스의 정적 메서드는 정적 내부 클래스가 생성되기 전에 호출될 수 있기 때문에 내부 클래스의 인스턴스변수를 사용하지 못한다.
			System.out.println("정적 변수, 내부 클래스의 정적 변수:"+sNum+" "+sInNum);

		}
		
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OutClass outClass=new OutClass();
		outClass.usingClass();
		
		OutClass.InClass inner=outClass.new InClass();
		inner.inTest();
		
		OutClass.InStaticClass sInClass=new OutClass.InStaticClass();
		sInClass.inTest();
		OutClass.InStaticClass.sTest();
		
	}

}
