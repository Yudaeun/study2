package ch17;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] library=new Book[5];
		
//		for(int i=0;i<library.length;i++) {
//			System.out.println(library[i]);
//		}
		library[0]=new Book("미움받을 용기","기시미 이치로");
		library[1]=new Book("오늘밤 세계에서 이 사랑이 사라진다해도","이치조 미사키");
		library[2]=new Book("골든아워1","이국종");
		library[3]=new Book("골든아워2","이국종");
		library[4]=new Book("자존감 수업","윤홍균");
		
		for(Book bookinfo:library) {
			bookinfo.showInfo();
		}
	}

}
