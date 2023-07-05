package ex04controlstatement;

public class QuPyramid04 {

	public static void main(String[] args) {

		/*
		다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
		실행결과]
			*
			* *
			* * *
			* * * *
			* * * * *
			* * * * 
			* * * 
			* * 
			*
		 */
		// *가 가장 많은 부분을 상수로 지정
		final int MAX_NUM = 20;
		// 전체 반복횟수
		int repeatNum = MAX_NUM * 2 - 1;
		// 감소횟수
		//int descNum = -1;
		
		for(int i=1; i<=repeatNum; i++) {
			if(i<MAX_NUM) {
				for(int j=1; j<=i; j++) {
					System.out.print("* ");
				}
			}else {
				for(int k=1; k<=repeatNum-i-1; k++) {
					System.out.print("* ");
				}
			}
			System.out.println();	
		}
		
	}

}
