package boj_1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt( br.readLine() );
		
		StringTokenizer st = null;
		int[][] iArr = new int[n][2];
		
		for(int i = 0 ; i < iArr.length ; i++) {
			st = new StringTokenizer( br.readLine() );
			
			for(int j = 0 ; j < iArr[i].length ; j++) {
				iArr[i][j] = Integer.parseInt( st.nextToken() );
			}
		}
		
		Arrays.sort(iArr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {

				//핵심!!! 만약 종료시간이 같으면 시작시간이 더 짧은 순으로 정렬한다!!
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			}
		});
		int cnt = 0;
		int bfEndTime = 0;
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			
			sb.append(iArr[i][0] + " / " + iArr[i][1]).append("\n");
			
			if( bfEndTime <= iArr[i][0]) {
				cnt++;
				bfEndTime = iArr[i][1];
			}
		
		}
		System.out.println(sb);
		System.out.println(cnt);
	}
}
