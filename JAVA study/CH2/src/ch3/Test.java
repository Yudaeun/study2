package ch3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.buy();
		customer.hell();
		customer.order();
		customer.sell();
		
		Buy buyer=customer;
		buyer.buy();
		buyer.order();
		
		Sell seller=customer;
		seller.sell();
		seller.order();
		
	}

}
