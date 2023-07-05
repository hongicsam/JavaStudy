package ex04controlstatement;

public class QuPyramid02 {

	public static void main(String[] args) {

		/*
		다음과 같은 모양을 출력하는 프로그램을 do~while문으로 작성하시오.
		실행결과]
			* * * * *
			* * * *
			* * *
			* *
			*
		 */
		int i = 5;
		do {
			int j = 1;
			do {
				System.out.print("* ");
				j++;
			// j가 i보다 작거나같을때 반복(i가 5일때 조건상관없이 실행되는것 포함하면 5회 i가 1일때 조건상관없이 실행되는것 포함하면 1회)
			}while(j<=i);
			System.out.println();
			i--;
		// i가 1보다 크거나같을때 반복(5~1까지 조건상관없이 실행되는것 포함하면 5회)
		}while(i>=1);
	}

}
