package com.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj_4673 {

	public static void main(String[] args) {
		d();
	}
	
	public static void d() {
		int newN = 0;
		boolean arr[] = new boolean[10001];
		
		for(int i = 1 ; i <= 10000 ; i++) {
			//newN = i + (i / 1000) + (i % 1000 / 100) + (i % 1000 % 100 / 10) + (i % 1000 % 100 % 10);
			newN = i + i / 1000 + (i / 100)%10 + (i/10)%10 + i % 10;
			if(newN > 10000) 
				newN = 0;
			arr[newN] = true;
		}
		for(int i = 1 ; i < 10000 ; i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
	}
}

