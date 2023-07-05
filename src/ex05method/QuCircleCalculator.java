package ex05method;

import java.util.Scanner;

public class QuCircleCalculator {

	/*
	원의 반지름을 인수(파라메타)로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 
	이를 호출하는 main 메소드를 정의하라.
	 */
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		// 입력받은 숫자를 반지름으로 사용할 변수에 저장
		double radius = scanner.nextDouble();
		
		// 메서드에 반지름의 값을 넣어서 프린트문에서 호출 
		System.out.printf("원의 둘레(%.1f) : %.3f\n", radius, circleArea(radius));
		System.out.printf("원의 넓이(%.1f) : %.3f", radius, circleRound(radius));
	}
	
	// 반환될 원의 넓이가 실수니까 double로 선언
	public static double circleArea(double radius) {
		// 원의 넓이 구하는 공식
		double cArea = 2 * 3.14 * radius;
		// 원의 넓이를 리턴
		return cArea;
	}
	// 반환될 원의 둘레가 실수니까 double로 선언
	public static double circleRound(double radius) {
		// 원의 둘레 구하는 공식
		// 원의 둘레를 리턴
		return (3.14 * radius * radius);
	}

}
