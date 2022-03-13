package boj_2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt( br.readLine() );
		
		ArrayList<Integer> iArr = new ArrayList<Integer>();
		
		for(int i = 0 ; i < n ; i++) {
			iArr.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(iArr);
		
		for(int a : iArr) {
			sb.append(a).append('\n');
		}
		System.out.println(sb);
	}
}
