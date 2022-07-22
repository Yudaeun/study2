package ch10;

public class GenericPrinter<T extends Material>{
	//T extends�� ��ӹ������ν� ����ϴ� ��Ḧ �������� �ְ�,�������� �� �� �ִ� �޼��带 ���� Ŭ�������� ������ �� �ִ�.

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	public String toString() {
		return material.toString();
	}
}
