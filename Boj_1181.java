package boj_1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt( br.readLine() );
		
		String[] strArr = new String[n];
		for(int i = 0 ; i < n ; i++) {
			strArr[i] = br.readLine();
		}
		
		for(int i = 0 ; i < strArr.length ; i++) {
			for(int j = i ; j < strArr.length ; j++) {
				
				int minLength = strArr[i].length();
				
				if(strArr[j].length() < minLength) {
					String tmpStr = strArr[j];
					strArr[j] = strArr[i];
					strArr[i] = tmpStr;
				} else if( strArr[j].length() == minLength ) {
					
					for(int z = 0 ; z < strArr[j].length() ; z++) {
						if( strArr[i].charAt(z) > strArr[j].charAt(z)) {
							String tmp = strArr[j];
							strArr[j] = strArr[i];
							strArr[i] = tmp;
						}
					}
				}
			}
		}
		System.out.println(strArr[0]);
		for(int i = 1 ; i < strArr.length ; i++) {
			if( strArr[i-1].equals( strArr[i] )) continue;
			System.out.println(strArr[i]);
		}
	}
}