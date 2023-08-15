import java.io.*;
import java.util.*;

public class BOJ_1463 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(dfs(N));
	}
	
	static int dfs(int N) {
		Queue<int[]> queue = new ArrayDeque<>();
		queue.add(new int[] {N, 0});
		
		while(!queue.isEmpty()) {
			int[] a = queue.poll();
			int n = a[0];
			int cnt = a[1];
			if(n==1) return cnt;
			
			if(n%3==0) queue.add(new int[] {n/3, cnt+1});
			if(n%2==0) queue.add(new int[] {n/2, cnt+1});
			queue.add(new int[] {n-1, cnt+1});
		}
		return 0;
	}
}
