package boj_2740;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int[][] nm = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];
		for(int i = 0 ; i < nm.length ; i++) {
			String[] strArr = br.readLine().split(" ");
			for(int j = 0 ; j < nm[i].length ; j++) {
				nm[i][j] = Integer.parseInt(strArr[j]);
			}
		}
		
		String[] input_2 = br.readLine().split(" ");
		int[][] mk = new int[Integer.parseInt(input_2[0])][Integer.parseInt(input_2[1])];
		for (int i = 0; i < mk.length; i++) {
			String[] strArr = br.readLine().split(" ");
			for (int j = 0; j < mk[i].length; j++) {
				mk[i][j] = Integer.parseInt(strArr[j]);
			}
		}
		
		
	}
}
