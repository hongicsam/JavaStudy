package ex07string;

import java.util.Scanner;

public class E02StringMethod4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		/*
		시나리오] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		System.out.println("1번 시나리오===================");
		System.out.print("(-)를 포함한 주민등록번호를 입력하세요 : ");
		String juminNum1 = scanner.nextLine();
		int gender1 = juminNum1.charAt(7);
		
		if(gender1=='1' || gender1=='3') {
			System.out.println("남성입니다.");
		}else if(gender1=='2' || gender1=='4') {
			System.out.println("여성입니다.");
		}else if(gender1=='5' || gender1=='6') {
			System.out.println("외국인입니다.");
		}else {
			System.out.println("주민등록번호를 잘못입력하셧습니다.");
		}

		
		/*
		시나리오]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
		이용해서 작성하시오.
		*/	
		System.out.println("2번 시나리오===================");
		System.out.print("(-)를 포함한 주민등록번호를 입력하세요 : ");
		String juminNum2 = scanner.nextLine();
		int gender2 = juminNum2.charAt(juminNum2.indexOf("-")+1);
		
		if(juminNum2.indexOf("-")+1==0) {
			System.out.println("주민등록번호를 잘못입력하셧습니다.");
		}else if(gender2=='1' || gender2=='3') {
			System.out.println("남성입니다.");
		}else if(gender2=='2' || gender2=='4') {
			System.out.println("여성입니다.");
		}else if(gender2=='5' || gender2=='6') {
			System.out.println("외국인입니다.");
		}else {
			System.out.println("주민등록번호를 잘못입력하셧습니다.");
		}
		
		/*
		시나리오] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		System.out.println("1번 시나리오===================");
		System.out.print("이메일을 입력하세요 : ");
		String email = scanner.nextLine();
		
		if(email.contains("@") && email.contains(".")) {
			System.out.println("이메일 형식이 맞습니다.");
		}else {
			System.out.println("이메일 형식이 아닙니다.");
		}
		
		
		/*
		시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		System.out.println("4번 시나리오===================");
		System.out.print("파일명을 입력하세요 : ");
		String file = scanner.nextLine();
		
		System.out.println("lastIndexOf+substring을 사용 :" + file.substring(file.lastIndexOf(".")+1));
		
		String[] fileArr = file.split("[.]");
		System.out.println("split을 사용 :" + fileArr[fileArr.length-1]);
		
	}

}
