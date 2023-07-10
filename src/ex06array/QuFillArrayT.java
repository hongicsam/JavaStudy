package ex06array;

import java.util.Scanner;

/*
홀수/짝수 구분하여 배열채우기
길이가 10인 배열을 선언한 후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)
 */
public class QuFillArrayT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 입력받은 숫자를 저장할 길이가 10인 정수배열 선언
		int[] inputArray = new int[10];
		// i가 배열의 길이까지 반복하는 for문
		for(int i=0; i<inputArray.length; i++) {
			// 배열에 저장할 숫자를 입력
			System.out.print(i+1 + "번째 정수를 입력하세요 : ");
			int inputNum = scanner.nextInt();
			// 입력받은 숫자를 i번째 배열에 저장
			inputArray[i] = inputNum;
		}
		System.out.println("순서대로입력된결과");
		// 배열의 0번부터 9번까지 10개를 출력
		for(int j=0; j<inputArray.length; j++) {
			System.out.print(inputArray[j] + " ");
		}
		// 음 뭔가 다른 방법이 있을것 같았는데 모르겠네요
		System.out.println("\n홀수/짝수 구분입력결과");
		// 배열에서 홀수만 출력하는 반복문
		for(int k=0; k<inputArray.length; k++) {
			// 배열의 k번째에 저장된 값을 2로 나누었을때 나머지가 0이 아니라면 출력
			if(inputArray[k]%2!=0) {
				System.out.print(inputArray[k] + " ");
			}
		}
		// 배열에서 짝수만 출력하는 반복문
		for(int l=0; l<inputArray.length; l++) {
			// 배열의 l번째에 저장된 값을 2로 나누었을때 나머지가 0이 라면 출력
			if(inputArray[l]%2==0) {
				System.out.print(inputArray[l] + " ");
			}
		}
	}

}
