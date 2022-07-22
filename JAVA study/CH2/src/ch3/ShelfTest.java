package ch3;

public class ShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue bookQueue=new BookShelf();
		bookQueue.enQueue("토지1");
		bookQueue.enQueue("토지2");
		bookQueue.enQueue("토지3");
		
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}
