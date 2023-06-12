package BOJ.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_11650 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<int[]> pq = new PriorityQueue<>((n1, n2)->{
			if(n1[0]==n2[0]) return n1[1]-n2[1];
			return n1[0]-n2[0];
		});
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			pq.add(new int[] {x,y});
		}
		
		for(int i=0; i<N; i++) {
			int[] xy = pq.poll();
			sb.append(xy[0]).append(' ').append(xy[1]).append("\n");
		}
		System.out.println(sb);
	}
}
