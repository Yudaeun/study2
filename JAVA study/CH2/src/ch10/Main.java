package ch10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Powder powder=new Powder();
		ThreeDPrinter3 printer=new ThreeDPrinter3();
		printer.setMaterial(powder);
		
		//Powder p=(Powder)printer.getMaterial();
		//제네릭 프로그래밍을 적용하지 않으면 위와 같이 Object 타입을 사용해줄 때 강제 형변환을 시켜줘야 한다.
		
		GenericPrinter<Powder> powderPrinter=new GenericPrinter<>();
		powderPrinter.setMaterial(powder);
		
		Powder p=powderPrinter.getMaterial();
		System.out.println(powderPrinter.toString());
	}

}
