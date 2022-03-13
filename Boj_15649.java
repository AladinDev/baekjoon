package boj_15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strArr = br.readLine().split(" ");
		
		int n = Integer.parseInt(strArr[0]);
		int m = Integer.parseInt(strArr[1]);
		
		for(int i = 1 ; i < n ; i++) {

			String str = String.valueOf(i);
			for(int j = 1 ; j <= m ; j++) {
				while( j <= m) {
				str += " " + j;
				}
			}
			System.out.println(str);
		}
	}
	
	public static int func() {
		
		return 0;
	}

}
