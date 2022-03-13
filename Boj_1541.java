package boj_1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] cArr = br.readLine().toCharArray();
		
		for(int i = 0 ; i < cArr.length ; i++) {
			for(int j = i ; j < cArr.length ; j++) {
				int max = cArr[i] - 45;
				
				if(max < cArr[j]-45) {
					char tmp = cArr[j];
					cArr[j] = cArr[i];
					cArr[i] = tmp;
				}
			}
		}
		for(char c : cArr) {
			System.out.print(c);
		}
	}
}
