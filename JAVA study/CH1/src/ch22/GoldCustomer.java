package ch22;

public class GoldCustomer extends Customer {
	double saleRatio;
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		// TODO Auto-generated constructor stub
		saleRatio=0.1;
		bonusRatio=0.02;
		customerGrade="GOLD";
	}
	
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}

	
}
