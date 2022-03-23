package ch17;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book[] library=new Book[5];
Book[] copylib=new Book[5];		

		library[0]=new Book("미움받을 용기","기시미 이치로");
		library[1]=new Book("오늘밤 세계에서 이 사랑이 사라진다해도","이치조 미사키");
		library[2]=new Book("골든아워1","이국종");
		library[3]=new Book("골든아워2","이국종");
		library[4]=new Book("자존감 수업","윤홍균");
		
		copylib[0]=new Book();
		copylib[1]=new Book();
		copylib[2]=new Book();
		copylib[3]=new Book();
		copylib[4]=new Book();
		

		for(int i=0;i<library.length;i++) {
			copylib[i].setTitle(library[i].getTitle());
			copylib[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("룬의 아이들");
		library[0].setAuthor("전민희");
		
		System.out.println("======");
		
		for(Book bookinfo:library) {
			bookinfo.showInfo();
		}
		
		System.out.println("======");
		for(Book bookcopy:copylib) {
			bookcopy.showInfo();
		}
	}

}
