import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int findMaxValue(int[] input, int strIdx, int endIdx) {

		if (endIdx == strIdx)
			return strIdx;

		int midIdx = (strIdx + endIdx) / 2;
		int bfIdx = findMaxValue(input, strIdx, midIdx);
		int afIdx = findMaxValue(input, midIdx + 1, endIdx);

		int result = input[bfIdx] > input[afIdx] ? bfIdx : afIdx;

		return result;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] inputArr = new int[9];
		for(int i = 0 ; i < inputArr.length ; i++) inputArr[i] = Integer.parseInt(br.readLine());
		
		int idx = findMaxValue(inputArr, 0, inputArr.length-1);
		System.out.println( inputArr[idx] );
		System.out.println( idx+1);
	}
}


//분할정복 n~m 까지의 합
//public class Main {
//	
//	static int consecutive_sum(int start, int end) {
//
//		
//		System.out.println(start + " / " + end);
//		
//		if( start == end ) return start;
//		
//		int mid = (start + end) / 2;
//		
//		System.out.println("consecutive_sum(" + start + ", " + mid + ")");
//		int test = consecutive_sum(start, mid);
//		System.out.println("Test : " + test);
//		System.out.println("end : " + end);
//		System.out.println("consecutive_sum mid+1(" + (mid+1) + ", " + end + ")");
//		test += consecutive_sum(mid+1, end);
//		System.out.println("Test_mid+1 : " + test);
//		
//		
//		int result = consecutive_sum(start, mid) + consecutive_sum(mid+1, end);
//		System.out.println(" result : " + result);
//		return result;
//		
//	}
//
//	public static void main(String[] args) throws IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		// 1-n까지. 분할정복 : 1~n까지에서 반 나눠서 정복 -> 반의 반을 나눠서 정복 -> 반의 반의 반을 나눠서 ..
//		// 1 2 3 4 5 6 7 8 9 10
//		System.out.println(consecutive_sum(1, 10));
//		
//	}
//	
//}

