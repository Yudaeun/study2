package ch18;

import java.util.ArrayList;

import ch17.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Book> library=new ArrayList<>();
		library.add(new Book("���� ���̵�","������"));
		library.add(new Book("���� ���̵�","������"));
		library.add(new Book("���� ���̵�","������"));
		library.add(new Book("���� ���̵�","������"));
		library.add(new Book("���� ���̵�","������"));
		
		for(int i=0;i<library.size()-4;i++) {
			library.get(i).showInfo();
		}
	}

}
