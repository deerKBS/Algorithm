package temp;

import java.util.StringTokenizer;

public class test {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer("aa-bb-cc","-");
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken().charAt(0));
		}
		System.out.println(sb);
	}
}
