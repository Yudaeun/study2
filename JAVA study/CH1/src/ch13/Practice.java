package ch13;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		for(num=1;num<=100;num++) {
			if((num%3)!=0) continue;
			System.out.println(num);
		}
}
}
