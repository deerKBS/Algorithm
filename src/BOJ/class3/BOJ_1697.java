package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1697 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] visit = new boolean[100001];
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{N,0});
        visit[N]=true;
        while(!q.isEmpty()){
            int[] nc = q.poll();
            if(nc[0]==K) {
                System.out.println(nc[1]);
                break;
            }
            int n = nc[0]-1;
            if(n>=0 && !visit[n]) {
                q.add(new int[]{n, nc[1] + 1});
                visit[n]=true;
            }
            n+=2;
            if(n<=100000 && !visit[n]) {
                q.add(new int[]{n, nc[1] + 1});
                visit[n]=true;
            }
            n=(n-1)*2;
            if(n<=100000 && !visit[n]) {
                q.add(new int[]{n, nc[1] + 1});
                visit[n]=true;
            }
        }
    }
}
