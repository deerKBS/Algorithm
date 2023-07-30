package BOJ.unclass;

import java.io.*;
import java.util.*;

public class BOJ_10323 {
	
	static List<Integer>[] friend;
	static boolean[] visit;
	static boolean flag=false;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		friend = new List[N];
		
		for(int i=0; i<N; i++) friend[i]=new ArrayList<>();
		
		for(int i=0; i<M; i++) {
			st=new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			friend[n1].add(n2);
			friend[n2].add(n1);
		}
		
		for(int i=0; i<N; i++) {
			visit = new boolean[N];
			visit[i]=true;
			dfs(i, 1);
			if(flag) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}
	
	static void dfs(int idx, int cnt) {
		if(cnt==5) {
			flag=true;
			return;
		}
		
		for(int i: friend[idx]) {
			if(visit[i]) continue;
			visit[i]=true;
			dfs(i, cnt+1);
			visit[i]=false;
		}
	}
}