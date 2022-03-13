import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] inputArr = new int[10];
		int[] resultArr = new int[42];
		
		for(int i : inputArr) {
			i = Integer.parseInt( br.readLine() );
			resultArr[ i % 42 ] += 1;
		}
		
		int cnt = 0;
		
		for( int j = 0 ; j < resultArr.length ; j++) {
			if( resultArr[j] >= 1) {
				cnt ++;
			}
		}
		
		System.out.println(cnt);
	}
}
