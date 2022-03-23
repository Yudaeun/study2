package ch21;

public class VIPCustomer extends Customer{


	private String agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	
	public String getAgentID() {
		return agentID;
	}
}
