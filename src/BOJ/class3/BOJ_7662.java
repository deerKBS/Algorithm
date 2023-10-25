package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_7662 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pqMax = new PriorityQueue<Integer>((p1, p2)->p2-p1);
		PriorityQueue<Integer> pqMin = new PriorityQueue<Integer>((p1, p2)->p1-p2);
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=0; tc<T; tc++) {
			int K = Integer.parseInt(br.readLine());
			int t = 0;
			for(int k=0; k<K; k++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				char c = st.nextToken().charAt(0);
				int n = Integer.parseInt(st.nextToken());
				if(c=='I') {
					pqMax.add(n);
					pqMin.add(n);
					t++;
					continue;
				}else if(t>0) {
					if(n==1) {
						pqMax.poll();
					}else {
						pqMin.poll();
					}
					t--;
					System.out.println(pqMax.toString());
					System.out.println(pqMin.toString());
					System.out.println("---------------");
				}
			}
			if(t<1) {
				sb.append("EMPTY").append("\n");
			}else {
				sb.append(pqMax.peek()).append(' ').append(pqMin.peek()).append("\n");
			}
		}
		System.out.print(sb);
	}
}
