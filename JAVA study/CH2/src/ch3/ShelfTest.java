package ch3;

public class ShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue bookQueue=new BookShelf();
		bookQueue.enQueue("����1");
		bookQueue.enQueue("����2");
		bookQueue.enQueue("����3");
		
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}
