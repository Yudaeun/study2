package ch17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> sList=new ArrayList<String>();
		sList.add("Riri");
		sList.add("Mimi");
		sList.add("Day");
		
		Stream<String> stream=sList.stream();
		stream.forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.println(s+"\t"));
		System.out.println();
		sList.stream().map(s->s.length()).forEach(n->System.out.println(n+"\t"));
		sList.stream().filter(s->s.length()>=5).forEach(s->System.out.println(s));
	}

}
