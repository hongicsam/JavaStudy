package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {

		/*
		1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 프로그램을 while문으로 작성하시오.
		단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 출력의 결과는 누적되는 모든 수를 콘솔에 print한다.
		 */
		int i = 1;
		// 3의배수 이거나 7의배수의 합이 저장될 변수
		int sum = 0;
		// i가 1부터 100이 될때까지 반복
		while(i<=100) {
			// i가 3의 배수이거나 7의 배수일때
			if(i%3==0 || i%7==0) {
				// 3과 7의 공배수는 제외
				if(i%(3*7)!=0) {
					// sum에 i의 값을 +
					sum += i;
					System.out.println("3의배수 혹은 7의배수 " + i);
				}
			}
			i++;
		}
		System.out.println("3의배수 이거나 7의배수의 합 : " + sum);
		
	}

}
