package ex08class;
/*
	기본 4칙연산을 할때마다 연산의 결과와 몇번 수행되었는지를 출력하는 계산기 클래스를 정의해보자.
	아래 main함수에 부합하는 CalculatorEx 클래스를 정의하면되고 해당 수치는 임의로 바꿔도 된다.
	init() 멤버메소드에서는 계산의 결과를 카운트하는 멤버변수를 0으로 초기화 한다.
 */
class CalculatorEx {
	// 멤버 변수 선언
	// 반환될 값이 저장될 변수 선언
	double result;
	// 각 연산의 연산횟수를 저장할 변수 선언
	int addtry, mintry, multry, divtry;
	
	double add(double num1, double num2) {
		// 덧셈연산이 호출될때마다 addtry를 1씩 증가시킴
		addtry++;
		result = num1 + num2;
		return result;
	}
	double min(double num1, double num2) {
		// 뺄셈연산이 호출될때마다 mintry를 1씩 증가시킴
		mintry++;
		result = num1 - num2;
		return result;
	}
	double mul(double num1, double num2) {
		// 곱셈연산이 호출될때마다 multry를 1씩 증가시킴
		multry++;
		result = num1 * num2;
		return result;
	}
	double div(double num1, double num2) {
		// 나눗셈연산이 호출될때마다 divtry를 1씩 증가시킴
		divtry++;
		result = num1 / num2;
		return result;
	}
	// 연산횟수 변수들을 0으로 초기화 시킴
	void init() {
		addtry = 0;
		mintry = 0;
		multry = 0;
		divtry = 0;
	}
	// 연산횟수들을 출력시킴
	void showOpCount() {
		System.out.println("덧셈횟수 : " + addtry);
		System.out.println("뺄셈횟수 : " + mintry);
		System.out.println("곱셈횟수 : " + multry);
		System.out.println("나눗셈횟수 : " + divtry);
	}
}

public class QuSimpleCalculator {

	public static void main(String[] args) {
		
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1, 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5, 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0, 5.0));
		System.out.println("100 / 25 = " + cal.div(100, 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0, 3.0));
		cal.showOpCount();

	}

}