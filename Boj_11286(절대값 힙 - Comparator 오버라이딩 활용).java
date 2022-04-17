package boj_11286;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		PriorityQueue pq = new PriorityQueue<Integer>( 
			new Comparator<Integer>() {
				public int compare(Integer arg1, Integer arg2) {
					int absltVal1 = arg1 < 0 ? (-1)*arg1 : arg1;
					int absltVal2 = arg2 < 0 ? (-1)*arg2 : arg2;
					
					if(absltVal1 == absltVal2) return arg1 - arg2;
					return absltVal1 - absltVal2;
				}
			}
		);
		
		for(int i = 0 ; i < n ; i++) {
			int val = Integer.parseInt( br.readLine());
			
			if( val == 0 ) {
				if( pq.isEmpty() ) System.out.println("0");
				else System.out.println(pq.poll());
			} else {
				pq.offer(val);
			}
		}
	}
}
