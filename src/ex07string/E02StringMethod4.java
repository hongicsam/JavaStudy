package ex07string;

public class E02StringMethod4 {

	public static void main(String[] args) {

		/*
		시나리오] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		System.out.println("1번 시나리오===================");
		String mNum = "190419-3000000";
		String wNum = "190419-4000000";
		String a = mNum;
		if(a.charAt(7)=='1' || a.charAt(7)=='3') {
			System.out.println(a + " => 남자");
		}else if(a.charAt(7)=='2' || a.charAt(7)=='4'){
			System.out.println(a + " => 여자");
		}else {
			System.out.println("잘못입력하엿습니다.");
		}

		/*
		시나리오] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		System.out.println("2번 시나리오===================");
		String daum = "hong@daum.net";
		String naver = "not@naver";
		String b = naver;
		
		if(b.contains("@") && b.contains(".")) {
			System.out.println(b + " => 이메일 형식임");
		}else {
			System.out.println(b + " => 이메일 형식아님");
		}
		
		/*
		시나리오]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
		이용해서 작성하시오.
		*/	
		System.out.println("3번 시나리오===================");
		String c = mNum;
		if(c.indexOf("-")+1==6) {
			System.out.println(c + " => 여자");
		}else {
			System.out.println(c + " => 남자");
		}
		
		/*
		시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		System.out.println("4번 시나리오===================");
		String fileName = "my.file.images.jpg";
		System.out.println(fileName.substring(0,fileName.lastIndexOf(".")));
		
		
	}

}
