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
		
		System.out.println("�� ��� ���");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("���� ���");
		System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());
		
		System.out.println("20�� �̻� �� ���");
		customerList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
