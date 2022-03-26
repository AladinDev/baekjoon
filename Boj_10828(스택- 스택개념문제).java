import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		String[] arr = new String[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = br.readLine();
		}
		
//		14
//		push 1
//		push 2
//		top
//		size
//		empty
//		pop
//		pop
//		pop
//		size
//		empty
//		pop
//		push 3
//		empty
//		top
		
		for(int i = 0 ; i < n ; i++) {
			
			if( arr[i].contains("push") ) {
				int a = Integer.parseInt(arr[i].substring( arr[i].indexOf("push")+5, arr[i].length()));
				stack.push(a);
			} else if( arr[i].contains("top")) {
				System.out.println(stack.empty() ? -1 : stack.peek());
			} else if( arr[i].contains("size")) {
				System.out.println(stack.size());
			} else if( arr[i].contains("empty")) {
				System.out.println(stack.empty() ? 1 : 0);
			} else if( arr[i].contains("pop")) {
				System.out.println(stack.empty() ? -1 : stack.pop() );
			}
		}
		
	}

}
