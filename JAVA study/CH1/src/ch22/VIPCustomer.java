package ch22;

public class VIPCustomer extends Customer{


	private String agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID,String customerName) {
		super(customerID,customerName);
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;

	}
	
	public String getAgentID() {
		return agentID;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint+=price*bonusRatio;
		price-=(int)(price*saleRatio);
		return super.calcPrice(price);
	}
	
	
}
