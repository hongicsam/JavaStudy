package ex04controlstatement;

public class QuPyramid03 {

	public static void main(String[] args) {

		/*
		다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
		실행결과]
			         *
			       * * *
			     * * * * *
			   * * * * * * *
			 * * * * * * * * *
		 */
		// i가 0부터 4까지 5번 반복
		for(int i=0; i<5; i++) {
			// j가 1부터 5-i까지(i가 0일때 1부터 4까지 4회, i가 4일때 1부터 1까지 0회)반복
			for(int j=1; j<5-i; j++) {
				System.out.print("  ");
			}
			// k가 0부터 i*2+1까지(i가 0일때 0부터 1까지 1회, i가 4일때 0부터 9까지 9회)반복
			for(int k=0; k<i*2+1; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

}
