package boj_11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt( br.readLine() );
		
		int[][] xy = new int[n][2];
		
		
		for(int i = 0 ; i < n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < 2 ; j++) {
				xy[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		Arrays.sort(xy, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int[] result : xy) {
			sb.append(result[0] + " " + result[1] + "\n");
		}
		System.out.println(sb);
	}
}
