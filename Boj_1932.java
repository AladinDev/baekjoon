package boj_1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		int[] _fMax = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			list.add(br.readLine().split(" "));
		}
		
		int result = Integer.parseInt ( list.get(0)[0] );
		
		System.out.println(result(list, 1, 0, result));
	}
	
	public static int result(List<String[]> list, int idx, int s, int result) {
		
		
		if( idx == list.size() ) return result;
		
		int	bf = Integer.parseInt( list.get(idx)[s] );
		int	af = Integer.parseInt( list.get(idx)[s+1]);
		
		if( bf > af ) {
			result += bf;
			System.out.println("s : " + s + " bf : " + bf + " result : " + result);
			return result(list, ++idx, s, result);
		} else {
			result += af;
			System.out.println("s+1 : " + (s + 1) + " af : " + af + " result : " + result);
			return result(list, ++idx, s+1, result);
		}
	}
}


//public class Main {
//
//	public static void main(String[] args) throws NumberFormatException, IOException {
//
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		
//		List<String[]> list = new ArrayList<String[]>();
//		
//		for(int i = 0 ; i < n ; i++) {
//			list.add(br.readLine().split(" "));
//		}
//		
//		int result = Integer.parseInt ( list.get(0)[0] );
//		
//		System.out.println(result(list, 1, 0, result));
//	}
//	
//	public static int result(List<String[]> list, int idx, int s, int result) {
//		
//		
//		if( idx == list.size() ) return result;
//		
//		int	bf = Integer.parseInt( list.get(idx)[s] );
//		int	af = Integer.parseInt( list.get(idx)[s+1]);
//		
//		if( bf > af ) {
//			result += bf;
//			System.out.println("s : " + s + " bf : " + bf + " result : " + result);
//			return result(list, ++idx, s, result);
//		} else {
//			result += af;
//			System.out.println("s+1 : " + (s + 1) + " af : " + af + " result : " + result);
//			return result(list, ++idx, s+1, result);
//		}
//	}
//}
