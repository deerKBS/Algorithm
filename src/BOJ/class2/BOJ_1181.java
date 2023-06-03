package BOJ.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

// 단어 정렬
public class BOJ_1181 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		TreeSet<String> ts = new TreeSet<>((s1, s2)-> {
			if(s1.length() == s2.length()) return s1.compareTo(s2);
			else return s1.length() - s2.length();
		});
		
		for(int i=0; i<N; i++) {
			ts.add(br.readLine());
		}
		
		int size = ts.size();
		for(int i=0; i<size; i++) {
			sb.append(ts.pollFirst()).append("\n");
		}
		System.out.println(sb);
	}
}
