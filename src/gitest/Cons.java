package gitest;

class A{
	
}
class B extends A{
	public B() { // 디폴트 생성자
		super();
	};
}

public class Cons {
	public static void main(String[] args) {
		B b = new B();
	}
}
