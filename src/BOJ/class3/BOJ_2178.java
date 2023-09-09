package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178 {

	static int[] dy = {-1, 0, 1, 0};
	static int[] dx = {0, 1, 0, -1};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char[][] matrix = new char[N][M];
		
		for(int i=0; i<N; i++) {
			matrix[i] = br.readLine().toCharArray();
		}
		
		int n = N-1;
		int m = M-1;
		
		Queue<int[]> q = new ArrayDeque<>();
		q.add(new int[] {0, 0, 1});
		while(!q.isEmpty()) {
			int[] yxc = q.poll();
			int y = yxc[0];
			int x = yxc[1];
			int c = yxc[2];
			
			if(y==n && x==m) {
				System.out.println(c);
				break;
			}
			
			for(int d=0; d<4; d++) {
				int ny = y+dy[d];
				int nx = x+dx[d];
				
				if(ny<0 || ny>=N || nx<0 || nx>=M || matrix[ny][nx]=='0') continue;
				
				q.add(new int[] {ny, nx, c+1});
				matrix[ny][nx]='0';
			}
		}
	}

}
