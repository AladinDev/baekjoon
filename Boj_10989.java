package boj_10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		
		for(long l = 0 ; l < n ; l++) {
			list.add( Integer.parseInt( br.readLine() ));
		}
		
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for(int a : list) {
			sb.append(a + "\n");
		}
		System.out.println(sb);
	}
}
