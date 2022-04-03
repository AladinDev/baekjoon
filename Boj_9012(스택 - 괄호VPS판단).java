import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			System.out.println(solve(br.readLine()));	// nextLine()쓰면 안된다.
		}
	}
 
	public static String solve(String s) {
 
		Stack<Character> stack = new Stack<>();
 
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c == '(') { // 여는 괄호일 경우 스택에 넣는다.
				stack.push(c);
			}
			else if (stack.empty()) { // 닫는 괄호를 입력받았으나, 스택이 비어있는 경우=> 닫는 괄호가 더 많음(불안정)
				return "NO";
			}
			// 그 외의 경우 stack 원소를 pop 한다.
			else {
				stack.pop();
			}
		}
 
		if (stack.empty()) { //VPS조건을 만족하면 스택이 비어있음.
			return "YES";
		} 
		else {
			return "NO";
		}
	}
}


//public class Main {
//	static String recuCnt(Stack<Character> stack, int count) {
//		
//		if(count==0 && stack.size()==0) {
//			return "YES";
//		}
//		else if( count!=0 && stack.size()==0) {
//			return "NO";
//		} else {
//			if( stack.peek() == '(') {
//				count-= 1;
//				stack.pop();
//			} else if( stack.peek() == ')') {
//				count += 1;
//				stack.pop();
//			}
//			return recuCnt(stack, count);
//		}
//	}
//	public static void main(String[] args) throws NumberFormatException, IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Stack<Character> stack = new Stack<Character>();
//		int n = Integer.parseInt(br.readLine());
//		char[][] cArr = new char[n][];
//		
//		for(int i = 0 ; i < cArr.length ; i++) {
//			cArr[i] = br.readLine().toCharArray();
//		}
//		
//		for(int i = 0 ; i < cArr.length ; i++) {
//			for(int j = 0 ; j < cArr[i].length ; j++) {
//				stack.push(cArr[i][j]);
//			}
//			System.out.println(recuCnt(stack, 0));
//			stack.clear();
//		}
//	}
//}
