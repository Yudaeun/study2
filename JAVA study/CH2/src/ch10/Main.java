package ch10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Powder powder=new Powder();
		ThreeDPrinter3 printer=new ThreeDPrinter3();
		printer.setMaterial(powder);
		
		//Powder p=(Powder)printer.getMaterial();
		//���׸� ���α׷����� �������� ������ ���� ���� Object Ÿ���� ������� �� ���� ����ȯ�� ������� �Ѵ�.
		
		GenericPrinter<Powder> powderPrinter=new GenericPrinter<>();
		powderPrinter.setMaterial(powder);
		
		Powder p=powderPrinter.getMaterial();
		System.out.println(powderPrinter.toString());
	}

}
