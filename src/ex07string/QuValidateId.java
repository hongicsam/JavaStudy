package ex07string;

import java.util.Scanner;

/*
사용자로 부터 아이디를 입력받은 후 다음 조건에 만족하는지 확인할 수 있는 프로그램을 작성하시오.
	아이디는 8~12자 사이로만 사용할 수 있다. (length() 메서드 활용)
	영문과 숫자로만 입력할 수 있다. (charAt() 메서드 활용)
	특수기호, 공백, 그 외 모든 문자는 입력할 수 없다. 
위 조건에 만족하면 true, 만족하지 않으면 false를 반환한다. 
메서드명 : boolean idValidate(String inputId)
힌트 : (idChar>='a' && idChar<='z') 이와 같은 조건을 사용하면 된당^^*

 */
public class QuValidateId {
	// inputId가 조건에 만족하면 false를 반환 조건을 다 피한다면 true를 반환하는 메서드 선언
	public static boolean idValidate(String inputId) {
		// inputId의 길이가 8보다 작거나 12보다 크다면 false를 반환
		if(8>inputId.length() || inputId.length()>12) {
			return false;
		}
		for(int i=0; i<inputId.length(); i++) { // i가 0부터 inputId의 길이까지 반복할때 inputId의 i번째 문자가
			if(!( ('0'<=inputId.charAt(i) && inputId.charAt(i)<='9') // 0 보다 크고 9보다 작거나
					|| ('A'<=inputId.charAt(i) && inputId.charAt(i)<='Z') // A보다 크고 Z보다 작거나
					|| ('a'<=inputId.charAt(i) && inputId.charAt(i)<='z') )) { // a보다 크고 z보다 작지 않을때
				return false; // false를 반환
			}
		}
		// 위의 조건들을 전부 피했다면 true를 반환
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// String타입 inputId변수를 선언후 String 타입 변수 inputId에 저장
		System.out.print("아이디를 입력하세요 : ");
		String inputId = scanner.nextLine();
		
		// idValidate() 메서드에 inputId를 넣었을때
		if(idValidate(inputId)) { // true가 반환되면
			System.out.println("사용할 수 있는 아이디입니다.");
		}else { // false가 반환되면
			System.out.println("사용할 수 없는 아이디입니다.");
		}
	}

}
