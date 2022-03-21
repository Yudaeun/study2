package ch11;

public class TakeTrainsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJ=new Student("J",5000);
		Student studentT=new Student("T",10000);
		
		Bus bus100=new Bus(100);
		Bus bus500=new Bus(500);
		
		studentJ.takeBus(bus100);
		
		Subway greenSubway=new Subway(2);
		
		studentT.takeSubway(greenSubway);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusinfo();
		greenSubway.showBusinfo();
		
		bus500.showBusinfo();
	}

}
