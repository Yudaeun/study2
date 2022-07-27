package ch15;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add addL=(x,y)->{return x+y;}; //Add 인터페이스의 add함수를 구현한 것
		//Add addL=(x,y)->return x+y;
		System.out.println(addL.add(2, 3));
	}

}
