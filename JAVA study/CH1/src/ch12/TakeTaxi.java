package ch12;

public class TakeTaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentE=new Student("E",20000);
		Taxi ABCTaxi=new Taxi("ABC");
		Taxi BCATaxi=new Taxi("BCA");
		studentE.takeTaxi(ABCTaxi);
		
		studentE.showInfo();
		ABCTaxi.showTaxiInfo();
		BCATaxi.showTaxiInfo();
	}

}
