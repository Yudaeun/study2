package ch17;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book[] library=new Book[5];
Book[] copylib=new Book[5];		

		library[0]=new Book("�̿���� ���","��ù� ��ġ��");
		library[1]=new Book("���ù� ���迡�� �� ����� ��������ص�","��ġ�� �̻�Ű");
		library[2]=new Book("���ƿ�1","�̱���");
		library[3]=new Book("���ƿ�2","�̱���");
		library[4]=new Book("������ ����","��ȫ��");
		
		copylib[0]=new Book();
		copylib[1]=new Book();
		copylib[2]=new Book();
		copylib[3]=new Book();
		copylib[4]=new Book();
		

		for(int i=0;i<library.length;i++) {
			copylib[i].setTitle(library[i].getTitle());
			copylib[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("���� ���̵�");
		library[0].setAuthor("������");
		
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
