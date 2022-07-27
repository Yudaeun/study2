package ch18;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer one=new Customer("Day",20,20000);
		Customer two=new Customer("Riri",22,30000);
		Customer three=new Customer("Mimi",22,25000);
		List<Customer> customerList=new ArrayList<Customer>();
		customerList.add(one);
		customerList.add(two);
		customerList.add(three);
		
		System.out.println("고객 명단 출력");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("여행 비용");
		System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());
		
		System.out.println("20세 이상 고객 목록");
		customerList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
