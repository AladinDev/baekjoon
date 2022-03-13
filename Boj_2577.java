package boj_2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		String result =  String.valueOf( a * b * c );
		char[] toCharArr = result.toCharArray();
		int[] resultArr = {0, 0, 0, 0 ,0, 0, 0, 0, 0, 0};
		
		//toCharArr = 1 7 0 3 7 3 0 0
		for(char cV : toCharArr) {
			
			int index = cV - '0';
			resultArr[ index ] += 1;
			
		}
		
		for( int tt : resultArr) {
			System.out.println(tt);
		}
	}
}
