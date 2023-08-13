package BOJ.class3;

import java.io.*;
import java.util.*;

public class BOJ_1260 {

	static boolean[] visit;
	static List<Integer>[] list;
	static StringBuilder sb;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N+1];
		
		for(int i=1; i<=N; i++) {
			list[i]=new ArrayList<Integer>();
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			list[n1].add(n2);
			list[n2].add(n1);
		}
		for(int i=1; i<=N; i++) {
			list[i].sort((n1, n2)->n1-n2);
		}
		
		visit = new boolean[N+1];
		dfs(V);
		sb.append("\n");
		
		visit = new boolean[N+1];
		bfs(V);
		
		System.out.println(sb);

	}
	
	static void dfs(int idx) {
		visit[idx]=true;
		
		sb.append(idx).append(" ");
		
		for(int i : list[idx]) {
			if(visit[i]) continue;
			dfs(i);
		}
	}
	
	static void bfs(int idx) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(idx);
		visit[idx]=true;
		
		while(!queue.isEmpty()) {
			int v = queue.poll();
			sb.append(v).append(" ");
			
			for(int i : list[v]) {
				if(visit[i]) continue;
				queue.add(i);
				visit[i]=true;
			}
			
		}
	}
}