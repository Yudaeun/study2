package ch17;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] library=new Book[5];
		
//		for(int i=0;i<library.length;i++) {
//			System.out.println(library[i]);
//		}
		library[0]=new Book("�̿���� ���","��ù� ��ġ��");
		library[1]=new Book("���ù� ���迡�� �� ����� ��������ص�","��ġ�� �̻�Ű");
		library[2]=new Book("���ƿ�1","�̱���");
		library[3]=new Book("���ƿ�2","�̱���");
		library[4]=new Book("������ ����","��ȫ��");
		
		for(Book bookinfo:library) {
			bookinfo.showInfo();
		}
	}

}
