import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int resultArr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
		
			char charArr[] = br.readLine().toCharArray();
			
			int hap = 0;
			for( int j = 0 ; j < charArr.length ; j++) {
				if( charArr[j] == 'X') {
					hap = 0;
					continue;
				}
				hap = hap + 1;
				resultArr[i] += hap;
			}
		}
		
		for( int result : resultArr) {
			System.out.println(result);
		}
	}
}
