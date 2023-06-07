package BOJ.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_4949 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			if(str.equals(".")) break;
			
			Stack<Character> stack = new Stack<>();
			String ans = "yes";
			for(int i=0; i<str.length(); i++) {
				char c = str.charAt(i);
				switch(c) {
				case '(':
					stack.push('(');
					break;
				case ')':
					if(stack.isEmpty() || stack.pop()!='(') {
						ans = "no";
						i=str.length();
					}
					break;
				case '[':
					stack.push('[');
					break;
				case ']':
					if(stack.isEmpty() || stack.pop()!='[') {
						ans = "no";
						i=str.length();
					}
					break;
				}
			}
			if(!stack.isEmpty()) ans="no";
			sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}
}
