package boj_1927;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		PriorityQueue pq = new PriorityQueue<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < n ; i++) {
			int val = Integer.parseInt( br.readLine());

			if( val == 0 ) {
				if( pq.isEmpty() ) {
					System.out.println("0");
				} else {
					System.out.println(pq.poll());
				}
			} else {
				pq.offer(val);
			}
		}
	}
}