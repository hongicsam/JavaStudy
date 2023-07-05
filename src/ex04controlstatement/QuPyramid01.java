package ex04controlstatement;

public class QuPyramid01 {

	public static void main(String[] args) {

		/*
		다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
		실행결과]
			*
			* *
			* * *
			* * * *
			* * * * *
		 */
		int i = 1;
		// i가 5보다 작을때 반복(1~5까지 5회)
		while(i<=5) {
			int j = 1;
			// j가 i보다 작을때 반복(i가 1일때는 1회 i가 5일때는 5회)
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
