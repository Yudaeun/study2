package ch6;

class Book{
	private String title;
	private String author;
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
		
	
	}//생성자
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title+","+author;
	}
}
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book("데미안","헤르만 헤세");
		System.out.println(book);
		
		String str=new String("test");
		System.out.println(str);
	}

}
