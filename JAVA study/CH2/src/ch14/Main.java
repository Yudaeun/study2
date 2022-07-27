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
		//�̳�Ŭ������ �ܺ�Ŭ������ ���� ������ �Ŀ� �����ȴ�. �׷��� ���� ������ ������ �� ����.
		void inTest() {
			System.out.println("�ܺ� Ŭ������ �ν��Ͻ�����, ���� ����, ���� Ŭ������ �ν��Ͻ� ����:"+num+" "+sNum+" "+iNum);
		}
	}
	public void usingClass() {
		inClass.inTest();
		//������ �̳� Ŭ������ �޼��带 usingClass���� ����Ѵ�.
	}
	static class InStaticClass {
		//�������� Ŭ����
		int iNum=100;
		static int sInNum=200;
		void inTest() {
			//���� Ŭ������ �Ϲ� �޼��忡���� �ܺ� Ŭ������ �ν��Ͻ� ������ �����Ǳ� ���� ���� �� �ֱ� ������ ������� ���Ѵ�.
			System.out.println("���� Ŭ������ �ν��Ͻ�����, ���� ����, ���� Ŭ������ ���� ����:"+iNum+" "+sNum+" "+sInNum);
		}
		static void sTest() {
			//���� ���� Ŭ������ ���� �޼���� ���� ���� Ŭ������ �����Ǳ� ���� ȣ��� �� �ֱ� ������ ���� Ŭ������ �ν��Ͻ������� ������� ���Ѵ�.
			System.out.println("���� ����, ���� Ŭ������ ���� ����:"+sNum+" "+sInNum);

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
