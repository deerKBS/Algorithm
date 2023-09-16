package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class BOJ_2667 {
	static int[] dy = {-1, 0, 1, 0};
	static int[] dx = {0, 1, 0, -1};
	static char[][] map;
	static int N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		map = new char[N][];
		for(int i=0; i<N; i++) {
			map[i] = br.readLine().toCharArray();
		}
		List<Integer> ans = new ArrayList<>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j]!='0') {
					int k = bfs(i,j);
					ans.add(k);
					System.out.println(k);
				}
			}
		}
		Collections.sort(ans);
		sb.append(ans.size()).append("\n");
		for(int a : ans) {
			sb.append(a).append("\n");
		}
		System.out.print(sb);
	}
	static int bfs(int i, int j) {
		int count = 1;
		Queue<int[]> q = new ArrayDeque<>();
		q.add(new int[] {i, j});
		map[i][j]='0';
		
		while(!q.isEmpty()) {
			count++;
			int[] t = q.poll();
			int y = t[0];
			int x = t[1];
			System.out.println(y+", "+x);
			for(int d=0; d<4; d++) {
				int ny = y + dy[d];
				int nx = x + dx[d];
				if(ny<0 || ny>=N || nx<0 || nx>=N || map[ny][nx]=='0') continue;
				q.add(new int[] {ny, nx});
				map[i][j]='0';
			}
		}
		
		return count;
	}
}
