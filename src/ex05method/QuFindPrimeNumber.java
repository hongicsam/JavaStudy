package ex05method;

import java.util.Scanner;

public class QuFindPrimeNumber {

	/*
	전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 반환하는 메소드를 정의하고,
	이를 이용해서 1부터 100사이의 소수를 전부 출력하는 main메소드를 정의하자.
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수인 숫자중에 아무거나 적어보세요 : ");
		// 입력받은 숫자를 int타입 변수에 저장
		int anyNum = scanner.nextInt();
		System.out.printf("1부터 %d사이의 소수 : ",anyNum);
		// 1부터 입력받은 숫자까지 반복(1부터 입력받은 숫자까지의 소수를 찾아야 함으로) 
		for(int j=1; j<=anyNum; j++) {
			// 1부터 입력받은 숫자까지 전부 메서드에 넣어서 호출
			if(isPrimeNumber(j)) {
				// 만약 리턴값이 true라면 현재 j는 소수가 맞다는 소리이므로 출력
				System.out.print(j+" ");
			}
			
		}
		
	}
	
	// 반환값이 true, false니까 boolean타입으로 선언
	public static boolean isPrimeNumber(int aNum) {
		
		// 정수 1은 소수가 아니므로 확인절차 없이 false를 반환한다.
		if(aNum==1) {
			return false;
		}
		// 소수인지 확인하는 공식(솔직히 아직도 이해는 안됐습니다...)
		// aNum이 소수가 맞으면 true를 반환하고 아니라면 false를 반환
		for(int i=2; i*i<=aNum; i++	) {
			if(aNum % i == 0) {
				return false;
			}
		}
		return true;
	}

}
