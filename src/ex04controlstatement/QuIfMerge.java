package ex04controlstatement;

public class QuIfMerge {

	public static void main(String[] args) {

		/*
		다음 예제는 두개의 if문을 사용하고 있다.이를 하나의 if문으로 변경해보자
		샘플코드]
			public static void main(String[] args)
			{
				 int num = 120;
				 if (num > 0) {
					if ((num % 2) == 0) {
						System.out.println("양수이면서 짝수");
					}
				 }
			}
		실행결과]
			양수이면서 짝수
		 */
		int num = 120;
		// if문 안에 if문 이니까 둘다 true일때이므로 and(&&)로 연결
		if (num>0 && num%2==0) {
			System.out.println("양수이면서 짝수");
		}
		
	}

}
