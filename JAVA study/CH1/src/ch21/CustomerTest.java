package ch21;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customerL=new Customer();
		customerL.setCustomerName("라라");
		customerL.setCustomerID(10010);
		customerL.bonusPoint=1000;
		System.out.println(customerL.showCustomerInfo());
		
		VIPCustomer customerK=new VIPCustomer();
		customerK.setCustomerName("미미");
		customerK.setCustomerID(10020);
		customerK.bonusPoint=1000;
		System.out.println(customerK.showCustomerInfo());
	}

}
