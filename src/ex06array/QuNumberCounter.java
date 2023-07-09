package ex06array;
/*
다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다.
배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오.
 */
public class QuNumberCounter {
	
	// 배열에서 변수 num과 동일한 숫자의 갯수를 반환하는 함수
	public static int numCount(int[] arr, int num) {
		// num과 같은 숫자의 개수가 저장될 변수 선언
		int cnt = 0;
		// 배열의 0번 인덱스 부터 배열의 끝까지 반복
		for(int j=0; j<arr.length; j++) {
			// 배열의 j번 인덱스의 숫자가 num과 같다면 cnt에 +1
			if(arr[j]==num) {
				cnt++;
			}
		}
		// 동일한 숫자의 갯수를 반환
		return cnt;
	}
	public static void main(String[] args) {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
		int[] counter = new int[4];
		
		// counter 배열을 채우는 반복문
		for(int i=0; i<counter.length; i++) {
			// counter배열의 i번째 인덱스는 answer배열에서 i+1과 동일한 숫자의 개수
			counter[i] = numCount(answer, i+1);
			System.out.printf("counter[%d] => %d", i, numCount(answer, i+1));
			System.out.println();
		}

	}

}
