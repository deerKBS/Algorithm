package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2606 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		List<List<Integer>> list = new ArrayList<>();
		for(int i=0; i<=N; i++) {
			list.add(new ArrayList<>());
		}
		StringTokenizer st;
		for(int i=0; i<C; i++) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			list.get(l).add(r);
			list.get(r).add(l);
		}
		
		boolean[] isVisit = new boolean[N+1];
		Queue<Integer> q = new ArrayDeque<>();
		int ans = 0;
		isVisit[1]=true;
		for(int n : list.get(1)) {
			q.add(n);
			isVisit[n]=true;
			ans++;
		}
		while(!q.isEmpty()) {
			int n = q.poll();
			for(int t : list.get(n)) {
				if(!isVisit[t]) {
					q.add(t);
					isVisit[t]=true;
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}
