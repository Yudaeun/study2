package ch2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=10;
		int num2=2;
		
		CompleteCalc calc=new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		calc.description();
		
		int[] arr= {1,2,3,4,5};
		System.out.println("total="+Calc.total(arr));

		
	}

}
