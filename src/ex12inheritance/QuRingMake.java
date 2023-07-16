package ex12inheritance;
/*
다음 Point클래스를 이용하여 다음 문제를 해결하시오.
해당 문제는 상속(Inheritance)을 통해 구현하는것이 아니라 구성(Composition)관계를 이용하여 해결한다.
Point 클래스를 기반으로 원을 의미하는 Circle클래스를 정의하자.
그리고 Circle클래스를 기반으로 Ring클래스를 정의하자.
 */
class Point {
	// 멤버변수 : 중심점 표현을 위해 x, y좌표값을 설정
   	int xDot, yDot;
   	// 생성자
   	public Point(int x, int y) {
 		xDot=x;
 		yDot=y;
   	}
   	// 멤버변수인 좌표값을 출력
   	public void showPointInfo() {
 		System.out.println("[x좌표:"+xDot+", y좌표:"+yDot+"]");
   	}
}
//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;
	// 생성자
	public Circle(int radian, int x, int y) {
		// 멤버변수 반지름을 초기화
		this.radian = radian;
		// Point인스턴스를 생성 및 초기화
		this.center = new Point(x, y);
	}
	// 원의 정보를 출력하는 멤버메서드
	public void showCircleInfo() {
		// 포인트 정보를 먼저 출력한다.
		center.showPointInfo();
		//반지름을 출력한다.
		System.out.println("반지름 : " + this.radian);
	}
}
//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	// 생성자
	public Ring(int inX, int inY, int inRadian, int outX, int outY, int outRadian) {
		// 안쪽 원 인스턴스 생성
		this.innerCircle = new Circle(inRadian, inX, inY);
		// 바깥쪽 원 인스턴스 생성
		this.outerCircle = new Circle(outRadian, outX, outY);
	}
	// 링의 정보를 출력하는 멤버메서드
	public void showRingInfo() {
		// 링은 원 2개의 정보를 동시에 출력하면된다.
		System.out.println("안쪽원의 정보 : ");
		innerCircle.showCircleInfo();
		System.out.println("바깥쪽원의 정보 : ");
		outerCircle.showCircleInfo();
	}
	
}
public class QuRingMake {

	public static void main(String[] args) {
		/*
		안쪽원의 정보 :
		반지름 : 3
		[x좌표:1, y좌표1]
		바깥쪽원의 정보 :
		반지름 : 9
		[x좌표:2, y좌표2]
		 */
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}

}
