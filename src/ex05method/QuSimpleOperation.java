package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {

	/*
	두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자.
	단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
	인수(파라메타)로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		// 입력받은 첫번째 숫자를 변수에 저장
		int firstNum = scanner.nextInt();
		// 입력한 숫자가 0보다 작으면 종료
		if(firstNum<0) {
			System.out.println("입력한 수가 0보다 작습니다.");
			System.exit(0);
		}
		System.out.print("두번째 숫자를 입력하세요 : ");
		// 입력받은 두번째 숫자를 변수에 저장
		int secondNum = scanner.nextInt();
		// 입력한 숫자가 0보다 작으면 종료
		if(secondNum<0) {
			System.out.println("입력한 수가 0보다 작습니다.");
			System.exit(0);
		}
		// 메서드에 첫번째숫자와 두번째숫자를 넣어서 호출
		arithmetic(firstNum, secondNum);
	}
	
	// 굳이 반환할 필요없이 출력만 하면 되니 void타입으로 메서드 선언
	public static void arithmetic(int fNum, int sNum) {
		System.out.printf("덧셈결과 -> %d\n", (fNum + sNum));
		System.out.printf("뺄셈결과 -> %d\n", (fNum - sNum));
		System.out.printf("곱셈결과 -> %d\n", (fNum * sNum));
		System.out.printf("나눗셈 몫 -> %d\n", (fNum / sNum));
		System.out.printf("나눗셈 나머지 -> %d", (fNum % sNum));
	}

}
