package boj_1655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			int val = Integer.parseInt( br.readLine() );
			
			if( i % 2 == 0) {	//입력값이 홀수인경우
				maxHeap.offer(val);
			} else {
				minHeap.offer(val);
			}
			
			if( !maxHeap.isEmpty() && !minHeap.isEmpty() ) {
				if( maxHeap.peek() > minHeap.peek() ) {
					int temp = maxHeap.poll();
					maxHeap.offer(minHeap.poll());
					minHeap.offer(temp);
				}
			}
			sb.append(maxHeap.peek() + "\n");
		}
		System.out.println(sb.toString());
	}
}
