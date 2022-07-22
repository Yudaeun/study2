package ch10;

public class GenericPrinter<T extends Material>{
	//T extends로 상속받음으로써 써야하는 재료를 한정시켜 주고,공통으로 쓸 수 있는 메서드를 상위 클래스에서 지정할 수 있다.

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
