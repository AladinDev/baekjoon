import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		double dArr[] = new double[N];
		StringTokenizer st = new StringTokenizer( br.readLine(), " ");
		
		for(int i = 0 ; i < dArr.length ; i++) {
			dArr[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort( dArr );
		
		double max = dArr[ dArr.length - 1];
		double sum = 0.0;
		
		for( double dVal : dArr) {
			sum += dVal / max * 100;
		}
		
		System.out.println(sum / dArr.length);
	}
}
