import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt( br.readLine() );
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push( Integer.parseInt( br.readLine() ));
		for(int i = 1 ; i < n ; i++) {
			int input = Integer.parseInt( br.readLine() );
			
			if( input == 0) {
				stack.pop();
			} else {
				stack.push( input );
			}
		}
		
		int result = 0;
		for(Integer i : stack) {
			result += i;
		}
		System.out.println(result);
	}
}
