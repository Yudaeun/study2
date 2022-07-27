package ch17;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5};
		
		for(int num:arr) {
			System.out.println(num);
		}
		Arrays.stream(arr).forEach(n->System.out.println(n));
		//IntStream is = Arrays.stream(arr);
		//if.forEach(n->System.out.println(n));
		//한 번 사용했기 때문에 또 사용하려면 새로운 스트림을 생성해야 한다.
		
	}
	

}
