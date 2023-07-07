package ex06array;

public class QuNumberCounter {
	
	public static int numCount(int[] arr, int num) {
		int cnt = 0;
		for(int j=0; j<arr.length; j++) {
			if(arr[j]==num) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
		int[] counter = new int[4];
		
		for(int i=0; i<counter.length; i++) {
			counter[i] = numCount(answer, i+1);
			System.out.printf("counter[%d] => %d", i, numCount(answer, i+1));
			System.out.println();
		}

	}

}
