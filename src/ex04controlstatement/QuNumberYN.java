package ex04controlstatement;

import java.io.IOException;

public class QuNumberYN {

	public static void main(String[] args) throws IOException {
		/*
		하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.	
		(System.in.read()를 사용하세요)
			실행결과] 아래는 2번 실행하였습니다.
				하나의 문자를 입력하세요:a
				숫자가아닙니다
				하나의 문자를 입력하세요:7
				숫자입니다
		 */
		System.out.print("문자를 입력하시오 : ");
		// 입력받은 내용의 첫번째문자를 아스키코드로 변환해서 정수변수 ch에 초기화
		int ch = System.in.read();
		/*
		삼항연산자로 ch의 값이 48(0)보다 크거나 같고 57(9)보다 작거나 같을때 "숫자가 맞습니다."로 result에 초기화 하고 
		아니라면 "숫자가 아닙니다."로 초기화 한다.
		 */
		String result = ch>=48 && ch<=57 ? "숫자가 맞습니다." : "숫자가 아닙니다.";
		System.out.println(result);
		
	}

}
