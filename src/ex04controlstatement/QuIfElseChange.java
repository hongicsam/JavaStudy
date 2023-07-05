package ex04controlstatement;

public class QuIfElseChange {

	public static void main(String[] args) {

		/*
		아래 코드의 삼항연산자를 if~else문으로 변경하시오. 단, 실행결과는 동일해야 합니다.
		샘플코드]
			public static void main(String[] args)
			{
				int num1=50, num2=100;
				int big, diff;
			
				big = (num1>num2)? num1:num2; //조건?참:거짓;
				System.out.println(big);
			
				diff = (num1>num2)? num1-num2: num2-num1;
				System.out.println(diff); 
			}
		실행결과]
			100
			50
		 */
		int num1=50, num2=100;
		int big, diff;
		// if문으로 num1과 num2를 비교
		if(num1>num2) {
			// num1이 크면 num1을 저장
			big = num1;
		}else {
			// 아니면 num2를 저장
			big = num2;
		}
		System.out.println(big);
		
		// if문으로 num1과 num2를 비교
		if(num1>num2) {
			// num1이 크면 num1-num2를 저장
			diff = num1-num2;
		}else {
			// 아니면 num2-num1를 저장
			diff = num2-num1;
		}
		System.out.println(diff);
		
	}

}
