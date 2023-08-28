package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1012 {
    static boolean[][] isVisited;
    static int[][] matrix;
    static int[] dx = new int[]{0, 1, 0 ,-1};
    static int[] dy = new int[]{-1, 0, 1, 0};
    static int N, M;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            matrix = new int[N][M];
            int x = 0, y = 0;
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());
                matrix[y][x] = 1;
            }

            isVisited = new boolean[N][M];
            int count=0;
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(matrix[i][j]==1 && !isVisited[i][j]){
                        bfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    static void bfs(int i, int j){
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{i, j});

        while(!q.isEmpty()){
            int[] yx = q.poll();
            int y = yx[0];
            int x = yx[1];
            isVisited[y][x]=true;

            for(int d=0; d<4; d++){
                int ny = y+dy[d];
                int nx = x+dx[d];
                if(ny<0 || ny>=N || nx<0 || nx>=M|| isVisited[ny][nx] || matrix[ny][nx]==0) continue;

                q.add(new int[]{ny, nx});
                isVisited[ny][nx]=true;
            }
        }
    }
}
