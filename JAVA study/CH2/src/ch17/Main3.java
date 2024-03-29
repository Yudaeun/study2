package ch17;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{
	public String apply(String s1,String s2) {
		if(s1.getBytes().length>=s2.getBytes().length)return s1;
		else return s2;
	}
}
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String greetings[]= {"one","two","Three","Four"};
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->
				{if (s1.getBytes().length>=s2.getBytes().length) return s1;
				else return s2;
				}));
		String str=Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}

}
