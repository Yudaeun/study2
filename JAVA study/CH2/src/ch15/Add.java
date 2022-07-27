package ch15;

@FunctionalInterface
//메서드를 두 개 선언하면 안된다. 함수형 인터페이스라는 의미이다.
public interface Add {

	public int add(int x,int y);
}
