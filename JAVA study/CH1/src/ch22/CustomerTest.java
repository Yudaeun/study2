package ch22;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Customer> customerList=new ArrayList<>();
		
		Customer customerT=new Customer(10010,"T");
		Customer customerJ=new GoldCustomer(10020,"J");
		Customer customerE=new VIPCustomer(10030,"E");
		Customer customerP=new Customer(10040,"P");
		
		customerList.add(customerT);
		customerList.add(customerE);
		customerList.add(customerJ);
		customerList.add(customerP);
		
		
		for(Customer customer:customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println();
		
		int price=10000;
		for(Customer customer:customerList) {
			int cost=customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님이 "+cost+"원 지불했습니다.");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는 "+customer.bonusPoint+" 입니다.");
		}
	}

}
