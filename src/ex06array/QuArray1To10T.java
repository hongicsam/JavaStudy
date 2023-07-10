package ex06array;
/*
다음 절차에 따라 프로그램을 작성하시오.
1. 크기가 10인 정수타입의 배열을 선언한다.
2. 반복문을 이용하여 배열을 채운다. 
이때 배열은 1,2,3,4....순서대로 채운다.
3. 2번에서 채운 배열을 출력한다.
4. 위에서 채운 배열의 첫번째 값에서 마지막값까지 누적해서 더한다.
5. 누적해서 더한 값을 출력한다.
 */
public class QuArray1To10T {

	public static void main(String[] args) {
		// 크기가 10인 정수타입 배열 선언
		int[] aArray = new int[10];
		// 배열의 모든숫자를 더한값을 저장할 변수 선언
		int sum = 0;
		
		System.out.println("초기화된 배열 요소");
		// for문으로 i가 배열의 크기만큼 될때까지 반복
		for(int i=0; i<aArray.length; i++) {
			// 배열의 i번은 i+1 (aArray[0] = 0+1 => 1)
			aArray[i] = i+1;
			System.out.print(aArray[i] + " ");
			// 반복할때마다 sum에 i+1씩 더하기
			sum += i+1;
		}
		System.out.println("\n배열전체요소의합 : " + sum);
	}

}
