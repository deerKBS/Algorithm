package BOJ.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11866 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder('<');
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new ArrayDeque<Integer>();
		for(int i=1; i<=N; i++) {
			q.add(i);
		}
		
		int i=0;
		while(q.size()!=1) {
			i++;
			if(i==K) {
				i=0;
				sb.append(q.poll()).append(", ");
			}
			else {
				q.add(q.poll());
			}
		}
		sb.append(q.poll()).append('>');
		System.out.println(sb);
	}

}
