package ex08class;
/*
	밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의해보자. init메소드를 통해 밑변과 높이를 초기화한다.
	그리고 밑변과 높이를 변경시킬수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의해보자.
 */
class Triangle {
	// 멤버 변수 선언
	// 삼각형의 밑줄과 높이를 저장할 변수 선언
	int tBottom, tHeight;
	
	// 반환할 값이 없으므로 void로 선언
	void setBottom(int tb){
		// 삼각형의 밑줄을 tb로 초기화
		tBottom = tb;
	}
	void setHeight(int th) {
		// 삼각형의 높이를 th로 초기화
		tHeight = th;
	}
	void init(int tb, int th) {
		// 삼각형의 밑줄과 높이를 tb와 th로 초기화
		tBottom = tb;
		tHeight = th;
	}
	// 넓이가 실수로 나올수있으니 반환값을 double로 반환하기 위해 double로 선언
	double getArea() {
		// 삼각형의 넓이 구하는 공식
		return tBottom * tHeight * 0.5;
	}
}
public class QuTriangle {

	public static void main(String[] args) {

		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);//밑변 50으로 변경 
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : "+ t.getArea());

	}

}
